package com.ead.course.services;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.ead.course.models.ModuleModel;
import com.ead.course.specifications.SpecificationTemplate.ModuleSpec;

public interface ModuleService {

	void delete(ModuleModel moduleModel);

	ModuleModel save(ModuleModel moduleModel);

	Optional<ModuleModel> findModuleIntoCourse(UUID courseId, UUID moduleId);

	List<ModuleModel> findAllByCourse(UUID courseId);

	Optional<ModuleModel> findById(UUID moduleId);

	Page<ModuleModel> findAllByCourse(UUID courseId, ModuleSpec spec, Pageable pageable);
}
