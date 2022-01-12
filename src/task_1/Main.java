package task_1;

import task_1.my_exception.AbcException;
import task_1.my_exception.OneATwoBException;
import task_1.string_editor.StringEditor;
import task_1.my_exception.ThreeFivesException;

import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("string:");
        String str = sc.nextLine();    //     7938-FMw-2841-siL-8S1f || 5558-abc-2841-siL-1a2b  для вставки
//        String str = "7938-FMw-2841-siL-8S1f";

        StringEditor.printTwoBlocks(str);

        StringEditor.replacingLetters(str);

        StringEditor.onlyLowercaseLetters(str);

        StringEditor.onlyUppercaseLetters(str);

        String str2 = "abc";
        try {
            StringEditor.doesContainSubstring(str, str2);
        } catch (AbcException e) {
            System.out.println(e.getMessage());
        }

        str2 = "555";
        try {
            StringEditor.startsWith(str, str2);
        } catch (ThreeFivesException e) {
            System.out.println(e.getMessage());
        }

        str2 = "1a2b";
        try {
            StringEditor.endsWith(str, str2);
        } catch (OneATwoBException e) {
            System.out.println(e.getMessage());
        }

    }

}
