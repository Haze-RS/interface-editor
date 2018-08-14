package com.greg.model.cache.archives.widget

import com.greg.model.cache.archives.font.Font

class WidgetData(var id: Int) {
    lateinit var actions: Array<String?>
    var alpha: Byte = 0
    var centeredText: Boolean = false
    var children: IntArray? = null
    lateinit var childX: IntArray
    lateinit var childY: IntArray
    var contentType: Int = 0
    var defaultAnimationId: Int = 0
    var defaultColour: Int = 0
    var defaultHoverColour: Int = 0
    var defaultMedia: Int = 0
    var defaultMediaType: Int = 0
    var defaultSpriteArchive: String? = null
    var defaultSpriteIndex: Int? = null
    lateinit var defaultText: String
    var filled: Boolean = false
    lateinit var font: Font
    var fontIndex: Int = 0
    var group: Int = 0
    var hasActions: Boolean = false
    var height: Int = 0
    var hidden: Boolean = false
    lateinit var hover: String
    var hoverId: Int = 0
    lateinit var inventoryAmounts: IntArray
    lateinit var inventoryIds: IntArray
    var optionAttributes: Int = 0
    lateinit var optionCircumfix: String
    lateinit var optionText: String
    var optionType: Int = 0
    var parent: Int = 0
    var replaceItems: Boolean = false
    var scriptDefaults: IntArray? = null
    var scriptOperators: IntArray? = null
    var scripts: Array<IntArray?>? = null
    var scrollLimit: Int = 0
    var secondaryAnimationId: Int = 0
    var secondaryColour: Int = 0
    var secondaryHoverColour: Int = 0
    var secondaryMedia: Int = 0
    var secondaryMediaType: Int = 0
    var secondarySpriteArchive: String? = null
    var secondarySpriteIndex: Int? = null
    lateinit var secondaryText: String
    var shadowedText: Boolean = false
    var spritePaddingX: Int = 0
    var spritePaddingY: Int = 0
    var spritePitch: Int = 0
    var spriteRoll: Int = 0
    lateinit var spritesArchive: Array<String?>
    lateinit var sprites: Array<String?>
    lateinit var spritesIndex: Array<Int?>
    var spriteScale: Int = 0
    lateinit var spriteX: IntArray
    lateinit var spriteY: IntArray
    var swappableItems: Boolean = false
    var usableItems: Boolean = false
    var width: Int = 0

    override fun toString(): String {
        return Integer.toString(this.id)
    }

    companion object {
        const val OPTION_OK = 1
        const val OPTION_USABLE = 2
        const val OPTION_CLOSE = 3
        const val OPTION_TOGGLE_SETTING = 4
        const val OPTION_RESET_SETTING = 5
        const val OPTION_CONTINUE = 6

        const val TYPE_CONTAINER = 0
        const val TYPE_MODEL_LIST = 1
        const val TYPE_INVENTORY = 2
        const val TYPE_RECTANGLE = 3
        const val TYPE_TEXT = 4
        const val TYPE_SPRITE = 5
        const val TYPE_MODEL = 6
        const val TYPE_ITEM_LIST = 7
    }
}