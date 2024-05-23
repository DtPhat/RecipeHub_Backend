package com.example.RecipeHub.mappers;

import com.example.RecipeHub.dtos.RegisterRequest;
import com.example.RecipeHub.dtos.UserDTO;
import com.example.RecipeHub.entities.User;
import com.example.RecipeHub.enums.Role;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-05-23T17:45:30+0700",
    comments = "version: 1.4.2.Final, compiler: Eclipse JDT (IDE) 3.38.0.v20240417-1011, environment: Java 17.0.10 (Eclipse Adoptium)"
)
@Component
public class UserMapperImpl implements UserMapper {

    @Override
    public UserDTO userToUserDTO(User user) {
        if ( user == null ) {
            return null;
        }

        UserDTO userDTO = new UserDTO();

        userDTO.setRole( UserMapper.mapRole( user.getRole() ) );
        userDTO.setGender( UserMapper.mapGender( user.getGender() ) );
        userDTO.setBirthday( UserMapper.mapBirthdayFromUser( user.getBirthday() ) );
        userDTO.setBlocked( user.isBlocked() );
        userDTO.setEmail( user.getEmail() );
        userDTO.setLoginType( user.getLoginType() );
        userDTO.setUserId( user.getUserId() );
        userDTO.setFullName( user.getFullName() );
        userDTO.setProfileImage( user.getProfileImage() );

        return userDTO;
    }

    @Override
    public User registerRequestToUser(RegisterRequest registerRequest) {
        if ( registerRequest == null ) {
            return null;
        }

        User user = new User();

        user.setEmail( registerRequest.getEmail() );
        user.setPassword( registerRequest.getPassword() );
        user.setFullName( registerRequest.getFullName() );
        user.setProfileImage( registerRequest.getProfileImage() );
        user.setBirthday( UserMapper.mapBirthday( registerRequest.getBirthday() ) );
        user.setGender( registerRequest.getGender() );

        user.setRole( Role.USER );
        user.setEnable( false );

        return user;
    }
}
