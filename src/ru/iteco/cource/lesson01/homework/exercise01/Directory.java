package ru.iteco.cource.lesson01.homework.exercise01;

import java.util.List;

class Directory implements FSItem {
    List<FSItem> children;
    String name;

    public List<FSItem> getChildren() {
        return null;
    }

    public boolean isFileSystem() {
        return false;
    }

    public String getName() {
        return null;
    }

    public void setName() {
    }

    public String getPath() {
        return null;
    }

    public FSItem getParent() {
        return null;
    }
}
