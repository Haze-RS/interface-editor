package com.greg.canvas.widget

import com.greg.properties.attributes.Property.Companion.createColourPicker
import com.greg.properties.attributes.Property.Companion.createGroup
import com.greg.properties.attributes.Property.Companion.createTextField
import com.greg.properties.attributes.PropertyGroup
import com.greg.properties.attributes.types.ColourPickerProperty
import com.greg.properties.attributes.types.TextFieldProperty
import com.greg.settings.Settings
import com.greg.settings.SettingsKey
import javafx.geometry.VPos
import javafx.scene.paint.Color
import javafx.scene.paint.Paint
import javafx.scene.text.Text

class WidgetText : WidgetRectangle {

    private val name: String = "Text"
    private var text: Text = Text()

    //Width and height arguments will be changed as soon as message is set anyway.
    constructor(string: String?, colour: Color?) : super(Settings.getDouble(SettingsKey.DEFAULT_POSITION_X), Settings.getDouble(SettingsKey.DEFAULT_POSITION_Y), 0.0, 0.0) {
        message = string
        text.stroke = colour
        text.textOrigin = VPos.TOP
        this.children.add(text)
    }

    private fun refreshSize() {
        super.rectangle.width = text.layoutBounds.width
        super.rectangle.height = text.layoutBounds.height
    }

    private var message: String?
        get() {
            return text.text
        }
        set(value) {
            text.text = value
            refreshSize()
        }

    private var stroke: Paint
        get() {
            return text.stroke
        }
        set(value) {
            text.stroke = value
        }

    override fun handleGroup(groups: MutableList<PropertyGroup>) {
        val group = groups.first()

        (group.properties[0].children[2] as TextFieldProperty).link({ t -> message = t })
        (group.properties[1].children[2] as ColourPickerProperty).link({ c -> stroke = c })

        groups.remove(group)
        super.handleGroup(groups)
    }

    override fun getGroup(): List<PropertyGroup> {
        var group = mutableListOf<PropertyGroup>()

        group.add(
                createGroup(name,
                        createTextField("Message", message),
                        createColourPicker("Text Colour", stroke as Color)
                )
        )

        group.addAll(super.getGroup())

        return group
    }

}
