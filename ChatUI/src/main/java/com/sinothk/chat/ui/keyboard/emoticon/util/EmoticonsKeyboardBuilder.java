package com.sinothk.chat.ui.keyboard.emoticon.util;

import com.sinothk.chat.ui.keyboard.emoticon.EmoticonSetBean;

import java.util.ArrayList;
import java.util.List;

/**
 * @author chris
 */
public class EmoticonsKeyboardBuilder {
    public Builder builder;

    private EmoticonsKeyboardBuilder(Builder builder) {
        this.builder = builder;
    }

    public static class Builder {
        List<EmoticonSetBean> mEmoticonSetBeanList = new ArrayList<>();

        public List<EmoticonSetBean> getEmoticonSetBeanList() {
            return mEmoticonSetBeanList;
        }

        public Builder setEmoticonSetBeanList(List<EmoticonSetBean> mEmoticonSetBeanList) {
            this.mEmoticonSetBeanList = mEmoticonSetBeanList;
            return this;
        }

        public EmoticonsKeyboardBuilder build() {
            return new EmoticonsKeyboardBuilder(this);
        }
    }
}
