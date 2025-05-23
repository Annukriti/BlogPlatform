package org.annu.blog.mappers;

import org.annu.blog.domain.CreatePostRequest;
import org.annu.blog.domain.UpdatePostRequest;
import org.annu.blog.domain.dtos.CreatePostRequestDto;
import org.annu.blog.domain.dtos.PostDto;
import org.annu.blog.domain.dtos.UpdatePostRequestDto;
import org.annu.blog.domain.entities.Post;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface PostMapper {

    @Mapping(target = "author", source = "author")
    @Mapping(target = "category", source = "category")
    @Mapping(target = "tags", source = "tags")
    @Mapping(target = "status", source = "status")
    PostDto toDto(Post post);

    CreatePostRequest toCreatePostRequest(CreatePostRequestDto dto);

    UpdatePostRequest toUpdatePostRequest(UpdatePostRequestDto dto);

}
