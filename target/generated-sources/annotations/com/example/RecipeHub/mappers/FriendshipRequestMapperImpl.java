package com.example.RecipeHub.mappers;

import com.example.RecipeHub.dtos.FriendshipRequestDTO;
import com.example.RecipeHub.entities.FriendshipRequest;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-05-23T17:45:30+0700",
    comments = "version: 1.4.2.Final, compiler: Eclipse JDT (IDE) 3.38.0.v20240417-1011, environment: Java 17.0.10 (Eclipse Adoptium)"
)
public class FriendshipRequestMapperImpl implements FriendshipRequestMapper {

    @Override
    public FriendshipRequestDTO friendshipRequestToFriendshipRequestDTO(FriendshipRequest friendshipRequest) {
        if ( friendshipRequest == null ) {
            return null;
        }

        FriendshipRequestDTO friendshipRequestDTO = new FriendshipRequestDTO();

        friendshipRequestDTO.setFriendshipRequestId( friendshipRequest.getFriendshipRequestId() );
        friendshipRequestDTO.setSender( FriendshipRequestMapper.mapSender( friendshipRequest.getSender() ) );
        friendshipRequestDTO.setReceiver( FriendshipRequestMapper.mapReceiver( friendshipRequest.getReceiver() ) );
        friendshipRequestDTO.setStatus( FriendshipRequestMapper.mapStatus( friendshipRequest.getStatus() ) );

        return friendshipRequestDTO;
    }
}
