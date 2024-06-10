package exceptions;

import java.io.*;
//прихващане на изключение, прихващане на нива, прихващане
// на група от изключения, пропускане на изключения към извикващ метод в стека, обработка на изключения и почистване на заети ресурси.
public class readFile {


        public static void readFile(String fileName)

                throws IOException {

            FileInputStream fis = null;
            BufferedReader in = null;

            try {

                fis = new FileInputStream(fileName);

                in = new BufferedReader(new InputStreamReader(fis));

                String tmp = null;

                while ((tmp = in.readLine()) != null) {

                    System.out.println(tmp);

                }

            } catch (FileNotFoundException e) {

                System.out.println("The file \"" + fileName

                        + "\" does not exist! Unable to read it.");

            } finally {

                if (in != null) {

                    in.close();

                }

                if (fis != null) {

                    fis.close();

                }

            }

        }



        public static void main(String[] args) {

            try {

                readFile("C:\\tools\\eclipse\\eclipse.ini");

            } catch (IOException e) {

                e.printStackTrace();

            }

        }

    }

