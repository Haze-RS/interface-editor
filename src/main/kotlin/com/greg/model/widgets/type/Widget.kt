package com.greg.model.widgets.type

import com.greg.controller.canvas.DragContext
import com.greg.model.cache.archives.widget.WidgetData
import com.greg.model.cache.archives.widget.WidgetDataConverter
import com.greg.model.settings.Settings
import com.greg.model.widgets.JsonSerializer
import com.greg.model.widgets.Jsonable
import com.greg.model.widgets.WidgetBuilder
import com.greg.model.widgets.WidgetType
import com.greg.model.widgets.properties.IntValues
import com.greg.model.widgets.properties.Properties
import com.greg.model.widgets.properties.extended.BoolProperty
import com.greg.model.widgets.properties.extended.IntProperty
import com.greg.model.widgets.properties.extended.ObjProperty
import com.greg.model.widgets.properties.extended.StringProperty
import com.greg.model.widgets.type.groups.GroupHover
import com.greg.model.widgets.type.groups.GroupOptions
import com.greg.model.widgets.type.groups.GroupWidget

open class Widget(builder: WidgetBuilder, id: Int) : GroupWidget(), Jsonable, GroupOptions, GroupHover {

    val type: WidgetType = builder.type
    val identifier = id
    val name: String = type.name.toLowerCase().capitalize()
    val dragContext = DragContext()

    val properties = Properties()

    override var x = IntProperty("x", Settings.getInt(Settings.DEFAULT_POSITION_X))
    override var y = IntProperty("y", Settings.getInt(Settings.DEFAULT_POSITION_Y))
    override var width = IntProperty("width", Settings.getInt(Settings.DEFAULT_RECTANGLE_WIDTH))
    override var height = IntProperty("height", Settings.getInt(Settings.DEFAULT_RECTANGLE_HEIGHT))

    override var widthBounds = ObjProperty("widthBounds", IntValues(Settings.getInt(Settings.DEFAULT_WIDGET_MINIMUM_WIDTH), Settings.getInt(Settings.WIDGET_CANVAS_WIDTH)))
    override var heightBounds = ObjProperty("heightBounds", IntValues(Settings.getInt(Settings.DEFAULT_WIDGET_MINIMUM_HEIGHT), Settings.getInt(Settings.WIDGET_CANVAS_HEIGHT)))

    override var locked = BoolProperty("locked", false)
    override var selected = BoolProperty("selected", false)
    override var invisible = BoolProperty("invisible", false)
    override var hidden = BoolProperty("hidden", false)
    override var hovered = BoolProperty("hovered", false)

    override var optionCircumfix = StringProperty("optionCircumfix", "")
    override var optionText = StringProperty("optionText", "")
    override var optionAttributes = IntProperty("optionAttributes", 0)
    override var hover = StringProperty("hover", "")

    override var parent = ObjProperty<Widget?>("parent", null)
    override var optionType = IntProperty("optionType", 0)
    override var contentType = IntProperty("contentType", 0)
    override var alpha = IntProperty("alpha", 0)
    override var hoverId = IntProperty("hoverId", 0)
    override var scriptOperators = ObjProperty("scriptOperators", IntArray(0))
    override var scriptDefaults = ObjProperty("scriptDefaults", IntArray(0))
    override var scripts: ObjProperty<Array<IntArray?>> = ObjProperty("scripts", arrayOfNulls(0))

    var updateSelection = true

    init {
        properties.add(x, category = "Layout")
        properties.add(y, category = "Layout")
        if(builder.type != WidgetType.SPRITE && builder.type != WidgetType.INVENTORY) {
            properties.addRanged(width, widthBounds, "Layout")
            properties.addRanged(height, heightBounds, "Layout")
        }
        properties.addPanel(locked, false)
        properties.addPanel(selected, false)
        properties.addPanel(invisible, false)
    }

    fun toData(): WidgetData {
        return WidgetDataConverter.toData(this)
    }

    fun fromData(data: WidgetData) {
        WidgetDataConverter.setData(this, data)
    }

    override fun fromJson(json: String) {
        val data = JsonSerializer.deserializer(json, WidgetData::class.java) ?: return
        fromData(data)
    }

    override fun toJson(): String {
        return JsonSerializer.serialize(toData())
    }

    override fun toString(): String {
        return "$type $identifier"//toJson()
    }

}