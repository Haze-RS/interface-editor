package rs.dusk.cache.definition.data

import rs.dusk.cache.Definition
import java.util.*

/**
 * @author Greg Hibberd <greg@greghibberd.com>
 * @since April 07, 2020
 */
@Suppress("ArrayInDataClass")
data class InterfaceComponentDefinition(
    override var id: Int = -1,
    var type: Int = 0,
    var aString4765: String? = null,
    var contentType: Int = 0,
    var basePositionX: Int = 0,
    var basePositionY: Int = 0,
    var baseWidth: Int = 0,
    var baseHeight: Int = 0,
    var horizontalSizeMode: Byte = 0,
    var verticalSizeMode: Byte = 0,
    var horizontalPositionMode: Byte = 0,
    var verticalPositionMode: Byte = 0,
    var parent: Int = -1,
    var hidden: Boolean = false,
    var disableHover: Boolean = false,
    var scrollWidth: Int = 0,
    var scrollHeight: Int = 0,
    var colour: Int = 0,
    var filled: Boolean = false,
    var alpha: Int = 0,
    var fontId: Int = -1,
    var monochrome: Boolean = true,
    var text: String = "",
    var lineHeight: Int = 0,
    var horizontalTextAlign: Int = 0,
    var verticalTextAlign: Int = 0,
    var shaded: Boolean = false,
    var lineCount: Int = 0,
    var defaultImage: Int = -1,
    var imageRotation: Int = 0,
    var aBoolean4861: Boolean = false,
    var imageRepeat: Boolean = false,
    var rotation: Int = 0,
    var backgroundColour: Int = 0,
    var flipVertical: Boolean = false,
    var flipHorizontal: Boolean = false,
    var aBoolean4782: Boolean = true,
    var defaultMediaType: Int = 1,
    var defaultMediaId: Int = 0,
    var aBoolean4707: Boolean = false,
    var centreType: Boolean = false,
    var ignoreZBuffer: Boolean = false,
    var viewportX: Int = 0,
    var viewportY: Int = 0,
    var viewportZ: Int = 0,
    var spritePitch: Int = 0,
    var spriteRoll: Int = 0,
    var spriteYaw: Int = 0,
    var spriteScale: Int = 100,
    var animation: Int = -1,
    var viewportWidth: Int = 0,
    var viewportHeight: Int = 0,
    var lineWidth: Int = 1,
    var lineMirrored: Boolean = false,
    var keyRepeat: ByteArray? = null,
    var keyCodes: ByteArray? = null,
    var keyModifiers: IntArray? = null,
    var aBoolean4802: Boolean = false,
    var applyText: String = "",
    var options: Array<String>? = null,
    var anIntArray4863: IntArray? = null,
    var aString4784: String? = null,
    var anInt4708: Int = 0,
    var anInt4795: Int = 0,
    var anInt4860: Int = 0,
    var aString4786: String = "",
    var anInt4698: Int = -1,
    var anInt4839: Int = -1,
    var anInt4761: Int = -1,
    var setting: InterfaceComponentSetting = InterfaceComponentSetting(0, -1),
    val params: HashMap<Long, Any>? = null,
    var anObjectArray4758: Array<Any?>? = null,
    var mouseEnterHandler: Array<Any?>? = null,
    var mouseExitHandler: Array<Any?>? = null,
    var anObjectArray4771: Array<Any?>? = null,
    var anObjectArray4768: Array<Any?>? = null,
    var stateChangeHandler: Array<Any?>? = null,
    var invUpdateHandler: Array<Any?>? = null,
    var refreshHandler: Array<Any?>? = null,
    var updateHandler: Array<Any?>? = null,
    var anObjectArray4770: Array<Any?>? = null,
    var anObjectArray4751: Array<Any?>? = null,
    var mouseMotionHandler: Array<Any?>? = null,
    var mousePressedHandler: Array<Any?>? = null,
    var mouseDraggedHandler: Array<Any?>? = null,
    var mouseReleasedHandler: Array<Any?>? = null,
    var mouseDragPassHandler: Array<Any?>? = null,
    var anObjectArray4852: Array<Any?>? = null,
    var anObjectArray4711: Array<Any?>? = null,
    var anObjectArray4753: Array<Any?>? = null,
    var anObjectArray4688: Array<Any?>? = null,
    var anObjectArray4775: Array<Any?>? = null,
    var clientVarp: IntArray? = null,
    var containers: IntArray? = null,
    var anIntArray4789: IntArray? = null,
    var clientVarc: IntArray? = null,
    var anIntArray4805: IntArray? = null,
    var hasScript: Boolean = false
) : Definition