package evgenyt.springdemo;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import java.util.Scanner;

/**
 * Password encoder for Spring Security
 * Aug 2019 EvgenyT
 */

public class SpringPass
{
    public static void main( String[] args )
    {
        System.out.println("Enter password:");
        String pass = new Scanner(System.in).next();
        System.out.println("Encoded: " + new BCryptPasswordEncoder().encode(pass));
    }
}
