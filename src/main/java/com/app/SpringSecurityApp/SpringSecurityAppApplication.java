package com.app.SpringSecurityApp;

import com.app.SpringSecurityApp.persistence.entity.PermissionEntity;
import com.app.SpringSecurityApp.persistence.entity.RoleEntity;
import com.app.SpringSecurityApp.persistence.entity.RoleEnum;
import com.app.SpringSecurityApp.persistence.entity.UserEntity;
import com.app.SpringSecurityApp.persistence.repositories.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;
import java.util.Set;

@SpringBootApplication
public class SpringSecurityAppApplication {

	public static void main(String[] args) {

		SpringApplication.run(SpringSecurityAppApplication.class, args);


	}
	/*
	@Bean
	CommandLineRunner init(UserRepository userRepository){
		return args->{
			//PERMISSION
			PermissionEntity createpermissionEntity= PermissionEntity.builder()
					.name("CREATE")
					.build();
			PermissionEntity readpermissionEntity= PermissionEntity.builder()
					.name("READ")
					.build();
			PermissionEntity updatepermissionEntity= PermissionEntity.builder()
					.name("UPDATE")
					.build();
			PermissionEntity deletepermissionEntity= PermissionEntity.builder()
					.name("DELETE")
					.build();
			PermissionEntity refactor= PermissionEntity.builder()
					.name("REFACTOR")
					.build();

			//Create ROLES
			RoleEntity createAdmin= RoleEntity.builder()
					.roleEnum(RoleEnum.ADMIN)
					.permissionList(Set.of(createpermissionEntity,readpermissionEntity,updatepermissionEntity,deletepermissionEntity))
					.build();
			RoleEntity roleUser= RoleEntity.builder()
					.roleEnum(RoleEnum.USER)
					.permissionList(Set.of(createpermissionEntity,readpermissionEntity))
					.build();
			RoleEntity createInvited= RoleEntity.builder()
					.roleEnum(RoleEnum.INTVITED)
					.permissionList(Set.of(readpermissionEntity))
					.build();
			RoleEntity createDev= RoleEntity.builder()
					.roleEnum(RoleEnum.DEVELOPER)
					.permissionList(Set.of(createpermissionEntity,readpermissionEntity,updatepermissionEntity,deletepermissionEntity,refactor))
					.build();

			//Create USER
			UserEntity userSantiago=UserEntity.builder()
					.username("santiago")
					.password("$2a$10$F2q5qjVWoBMugxLpc32W7.UKTIl75NaRkF60y.4hG0OWWu9UlIXSC")
					.isEnabled(true)
					.accountNoExpired(true)
					.accountNoLocked(true)
					.credentialNoExpired(true)
					.roles(Set.of(createAdmin))
					.build();
			UserEntity userIsabella=UserEntity.builder()
					.username("isabella")
					.password("$2a$10$F2q5qjVWoBMugxLpc32W7.UKTIl75NaRkF60y.4hG0OWWu9UlIXSC")
					.isEnabled(true)
					.accountNoExpired(true)
					.accountNoLocked(true)
					.credentialNoExpired(true)
					.roles(Set.of(roleUser))
					.build();
			UserEntity userFlabio=UserEntity.builder()
					.username("flabio")
					.password("$2a$10$F2q5qjVWoBMugxLpc32W7.UKTIl75NaRkF60y.4hG0OWWu9UlIXSC")
					.isEnabled(true)
					.accountNoExpired(true)
					.accountNoLocked(true)
					.credentialNoExpired(true)
					.roles(Set.of(createInvited))
					.build();

			UserEntity userRubiela=UserEntity.builder()
					.username("rubiela")
					.password("$2a$10$F2q5qjVWoBMugxLpc32W7.UKTIl75NaRkF60y.4hG0OWWu9UlIXSC")
					.isEnabled(true)
					.accountNoExpired(true)
					.accountNoLocked(true)
					.credentialNoExpired(true)
					.roles(Set.of(createDev))
					.build();
			userRepository.saveAll(List.of( userSantiago,userFlabio,userRubiela,userIsabella));
		};
	}*/

}
