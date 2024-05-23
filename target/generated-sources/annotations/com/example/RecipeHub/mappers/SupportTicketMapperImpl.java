package com.example.RecipeHub.mappers;

import com.example.RecipeHub.dtos.SupportTicketDTO;
import com.example.RecipeHub.entities.SupportTicket;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-05-23T17:45:30+0700",
    comments = "version: 1.4.2.Final, compiler: Eclipse JDT (IDE) 3.38.0.v20240417-1011, environment: Java 17.0.10 (Eclipse Adoptium)"
)
@Component
public class SupportTicketMapperImpl implements SupportTicketMapper {

    @Override
    public SupportTicketDTO entityToDto(SupportTicket supportTicket) {
        if ( supportTicket == null ) {
            return null;
        }

        SupportTicketDTO supportTicketDTO = new SupportTicketDTO();

        supportTicketDTO.setMessage( supportTicket.getMessage() );
        supportTicketDTO.setStatus( supportTicket.getStatus() );
        supportTicketDTO.setEmail( supportTicket.getEmail() );
        supportTicketDTO.setSupportTicketId( supportTicket.getSupportTicketId() );

        return supportTicketDTO;
    }
}
