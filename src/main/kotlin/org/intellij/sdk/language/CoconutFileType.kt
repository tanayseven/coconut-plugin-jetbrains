package org.intellij.sdk.language

import com.intellij.openapi.fileTypes.LanguageFileType
import javax.swing.*


class CoconutFileType : LanguageFileType(CoconutLanguage.INSTANCE){

    companion object {
        val INSTANCE: CoconutFileType = CoconutFileType()
    }

    override fun getName(): String {
        return "Coconut file"
    }

    override fun getDescription(): String {
        return "Coconut file"
    }

    override fun getDefaultExtension(): String {
        return "coco;coconut"
    }


    override fun getIcon(): Icon {
        return CoconutIcons.FILE
    }
}
