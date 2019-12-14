package vip.connorlu.mal;

import java.io.BufferedReader;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStreamReader;

public class step0_repl {

    final BufferedReader mIn;

    public step0_repl() {
        mIn = new BufferedReader(new InputStreamReader(System.in));
    }

    public String read(String input) {
        return input;
    }

    public String eval(final String inputStr) {
        return inputStr;
    }

    public String print(final String output) {
        System.out.print(output);
        return output;
    }



    public String repl(String str) {
        return print(eval(read(str)));
    }

    public static void main(String[] args) {
        step0_repl repl = new step0_repl();
        while (true) {
            System.out.print("user> ");
            String input = null;
            try {
                input = repl.mIn.readLine();
            } catch (EOFException e) {
                break;
            } catch (IOException e) {
                break;
            }

            if(input == null) {
                break;
            }

            repl.repl(input);
            System.out.println();

        }
    }


}

