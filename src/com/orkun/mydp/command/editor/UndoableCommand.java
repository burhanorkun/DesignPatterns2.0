package com.orkun.mydp.command.editor;

public interface UndoableCommand extends Command {
    void unexecute();
}
