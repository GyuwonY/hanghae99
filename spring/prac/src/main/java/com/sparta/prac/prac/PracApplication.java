package com.sparta.prac.prac;

import com.sparta.prac.prac.domain.PersonRepository;
import com.sparta.prac.prac.domain.PersonRequestDto;
import com.sparta.prac.prac.service.PersonService;
import org.jasypt.encryption.pbe.PooledPBEStringEncryptor;
import org.jasypt.encryption.pbe.StandardPBEStringEncryptor;
import org.jasypt.encryption.pbe.config.SimpleStringPBEConfig;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;


@SpringBootApplication
public class PracApplication {

    public static void main(String[] args) {
        PooledPBEStringEncryptor encryptor = new PooledPBEStringEncryptor();
        SimpleStringPBEConfig config = new SimpleStringPBEConfig();
        config.setPassword("livia_12@NAVER.com");
        config.setAlgorithm("PBEWithMD5AndDES");
        config.setKeyObtentionIterations("1000");
        config.setPoolSize("1");
        config.setProviderName("SunJCE");
        config.setSaltGeneratorClassName("org.jasypt.salt.RandomSaltGenerator");
        config.setIvGeneratorClassName("org.jasypt.iv.NoIvGenerator");
        config.setStringOutputType("base64");
        encryptor.setConfig(config);
        System.out.println(encryptor.encrypt("corinne-bucket"));
        System.out.println(encryptor.encrypt("AKIAYAS5KPFPVBIOXG5M"));
        System.out.println(encryptor.encrypt("7CouD7Z4Qq2I1ohyK9w749kMllSWVKvYyGmJNU0U"));
        System.out.println(encryptor.decrypt("ACQ6gTE8CGsdJH70r8bJQyNGhhu1nZsR"));
        System.out.println(encryptor.decrypt("ntI5p9Mg9e6dnQtlS1ZRrgnDbl8YbT/L07vAJJtAfiA="));
        System.out.println(encryptor.decrypt("CNwwl76jAlIT7P2OiDPFN5HNSVOvJ8w+yQ+nBzwXrnA4R0Hmx2Agb2V11ZVXic3xuA7K75HFbsI="));

    }
}
