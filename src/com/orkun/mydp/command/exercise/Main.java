package com.orkun.mydp.command.exercise;

public class Main {

    public static void main(String[] args) {
        var videoEditor = new VideoEditor();
        var history = new History();

        var setTextCommand = new SetTextCommand("Video Title", videoEditor, history);
        setTextCommand.execute();
        System.out.println("Text: " + videoEditor);

        var setContrast = new SetContrastCommand(1, videoEditor, history);
        setContrast.execute();
        System.out.println("Contrast: " + videoEditor);

        var undoCommand = new UndoCommand(history);
        undoCommand.execute();
        System.out.println("UNDO: " + videoEditor);

        undoCommand.execute();
        System.out.println("UNDO: " + videoEditor);

        undoCommand.execute();
        System.out.println("UNDO: " + videoEditor);

    }
}
