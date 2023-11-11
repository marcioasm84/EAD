package com.ead.course.services;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.ead.course.models.LessonModel;
import com.ead.course.specifications.SpecificationTemplate.LessonSpec;

public interface LessonService {

	LessonModel save(LessonModel lessonModel);

	Optional<LessonModel> findLessonIntoModule(UUID moduleId, UUID lessonId);

	void delete(LessonModel lessonModel);

	List<LessonModel> findAllByModule(UUID moduleId);

	Page<LessonModel> findAllByModule(UUID moduleId, LessonSpec spec, Pageable pageable);

}
