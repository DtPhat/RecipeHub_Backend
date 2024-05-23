package com.example.RecipeHub.mappers;

import com.example.RecipeHub.dtos.TagDTO;
import com.example.RecipeHub.entities.Tag;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-05-23T17:45:30+0700",
    comments = "version: 1.4.2.Final, compiler: Eclipse JDT (IDE) 3.38.0.v20240417-1011, environment: Java 17.0.10 (Eclipse Adoptium)"
)
@Component
public class TagMapperImpl implements TagMapper {

    @Override
    public TagDTO tagToTagDto(Tag tag) {
        if ( tag == null ) {
            return null;
        }

        TagDTO tagDTO = new TagDTO();

        tagDTO.setTagId( tag.getTagId() );
        tagDTO.setTagName( tag.getTagName() );

        return tagDTO;
    }
}
