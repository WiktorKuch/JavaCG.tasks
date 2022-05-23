package pl.codegym.task.task09.task0915;

import java.io.CharConversionException;
import java.io.IOException;
import java.nio.file.FileSystemException;

/* 
Obsługiwanie zwyczajnych wyjątków
*/

public class Solution {
    public static StatelessBean BEAN = new StatelessBean();

    public static void main(String[] args) throws  IOException {
        try {
            obslugaExceptions();
        }catch (FileSystemException e){
            BEAN.log(e);
        }catch (CharConversionException c ){
            BEAN.log(c);
        }catch (IOException v ){
            BEAN.log(v);
        }

    }

    public static void obslugaExceptions() throws  IOException , FileSystemException {
        try {
            BEAN.throwExceptions();

        }catch (FileSystemException e) {
            BEAN.log(e);
            throw e;
        }
        catch (CharConversionException b){
            BEAN.log(b);
        }
        catch (IOException c){
            BEAN.log(c);
        }




    }

    public static class StatelessBean {
        public void log(Exception exception) {
            System.out.println(exception.getMessage() + ", " + exception.getClass().getSimpleName());
        }

        public void throwExceptions() throws CharConversionException, FileSystemException, IOException {
            int i = (int) (Math.random() * 3);
            if (i == 0) {
                throw new CharConversionException();
            }
            if (i == 1) {
                throw new FileSystemException("");
            }
            if (i == 2) {
                throw new IOException();
            }
        }
    }
}
