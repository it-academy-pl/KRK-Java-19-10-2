package pl.itacademy.lesson16;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class ExceptionTester {
    public static void main(String[] args) {
        try {
            printFile("C:\\1\\test1.txt");
        } catch (IOException e) {
            System.out.println("File can't be read, because of: " + e.getMessage());
        }

        printFileAndHandleExceptions("C:\\1\\test1.txt");

        System.out.println("Application still running after exception!");

        Person first = new Person("1");
        Person second = new Person("2");
        Person third = new Person("3");

        PersonRegistrator.registerPerson(first, second, third);

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Enter pesel number: ");
            String pesel = scanner.nextLine();
            try {
                Person person = PersonRegistrator.findByPesel(pesel);
                System.out.println(person);
                break;
            } catch (PersonNotFoundException e) {
                System.out.println("Can't find person! " + e.getMessage());
                System.out.println("Check pesel number and try again!");
            }
        }

    }

    private static void printFile(String fileName) throws IOException {
        FileInputStream inputStream = new FileInputStream(fileName);
        BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream);
        byte[] bytes = bufferedInputStream.readAllBytes();
        for (byte aByte : bytes) {
            System.out.println((char) aByte);
        }
        bufferedInputStream.close();
        inputStream.close();
    }

    private static void printFileAndHandleExceptions(String fileName) {
        FileInputStream inputStream = null;
        BufferedInputStream bufferedInputStream = null;
        try {
            inputStream = new FileInputStream(fileName);
            bufferedInputStream = new BufferedInputStream(inputStream);
            byte[] bytes = bufferedInputStream.readAllBytes();
            for (byte aByte : bytes) {
                System.out.println((char) aByte);
            }
        } catch (IOException e) {
            System.out.println("something wrong");
        } finally {
            System.out.println("Finally section to be ran");
            try {
                if (bufferedInputStream != null) {
                    bufferedInputStream.close();
                }
                if (inputStream != null) {
                    inputStream.close();
                }
            } catch (IOException e) {
                System.out.println("can't close file resource");
            }
        }
    }

    private static void printFileAndHandleExceptionsWithResources(String fileName) {
        try (FileInputStream inputStream = new FileInputStream(fileName);
             BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream)) {

            byte[] bytes = bufferedInputStream.readAllBytes();
            for (byte aByte : bytes) {
                System.out.println((char) aByte);
            }
        } catch (NullPointerException | FileNotFoundException e) {
            System.out.println("File " + fileName + " not found!! " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Can't read file: " + fileName);
        }
    }

    private static void tryWithoutCatchExample(String fileName) throws IOException {
        FileInputStream inputStream = null;
        BufferedInputStream bufferedInputStream = null;
        try {
            inputStream = new FileInputStream(fileName);
            bufferedInputStream = new BufferedInputStream(inputStream);
            byte[] bytes = bufferedInputStream.readAllBytes();
            for (byte aByte : bytes) {
                System.out.println((char) aByte);
            }
        } finally {
            System.out.println("Finally section to be ran");
            try {
                if (bufferedInputStream != null) {
                    bufferedInputStream.close();
                }
                if (inputStream != null) {
                    inputStream.close();
                }
            } catch (IOException e) {
                System.out.println("can't close file resource");
            }
        }
    }

    private static void tryWithoutCatchAndWithoutFinallyStupidExample(String fileName) throws IOException {
        try (FileInputStream inputStream = new FileInputStream(fileName);
             BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream)) {

            byte[] bytes = bufferedInputStream.readAllBytes();
            for (byte aByte : bytes) {
                System.out.println((char) aByte);
            }
        }
    }


}
