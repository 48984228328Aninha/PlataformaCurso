Table user {
	id integer [ pk, increment, not null, unique ]
	uuid uuid
	username varchar
	email varchar
	password varchar
	exibition_name varchar
	status varchar
	creation_time timestamp
	updated_time timestamp
	photo_perfil varchar
	language_preference varchar
	last_access timestamp
	role varchar

	indexes {
		(id) [ name: 'user_index_0' ]
	}
}

Table progress {
	id integer [ pk, increment, not null, unique ]
	uuid uuid
	total_class integer
	total_time_study integer
	last_ativicty varchar

	indexes {
		(id) [ name: 'progress_index_0' ]
	}
}

Table subject {
	id integer [ pk, increment, not null, unique ]
	uuid uuid
	subject_name varchar
	description varchar
	workload varchar
}

Table enroll {
	id integer [ pk, increment, not null, unique ]
	uuid uuid
	status_matricula varchar
	dta_enroll timestamp
	dta_inicial timestamp
	dta_conclusion timestamp
	geral_progress varchar
	last_access_class varchar
}

Table course [headercolor: #175e7a] {
	id integer [ pk, increment, not null, unique ]
	uuid uuid
	nme_course varchar
	category_course varchar
	description_course varchar
	objective_course varchar
	title_course varchar
	target_audience varchar
	level_course varchar
	workload_course varchar
	language_course varchar
	status_course varchar
	dta_creation timestamp
	dta_publication timestamp
	dta_updated timestamp
	media_avaliation varchar
	qtd_students integer
	prior_requirements varchar
	certificate_avaiable boolean
}

Table result {
	id integer [ pk, increment, not null, unique ]
	uuid uuid [ not null ]
	grade double precision
	status_result varchar [ not null ]
	dta_submission timestamp
	tentative integer
	feedback varchar
}

Table avaliation {
	id integer [ pk, increment, not null, unique ]
	uuid uuid
	title_avaliation varchar
	type varchar
	max_grade integer
	min_grade integer
	try_quantity integer
	limit_time integer
	status_avaliation boolean
}

Table discipline {
	id integer [ pk, increment, not null, unique ]
	uuid uuid [ not null ]
	nme_discipline varchar
	description_discipline varchar
	workload_discipline varchar
}

Table module {
	id integer [ pk, increment, not null, unique ]
	uuid uuid
	title_module varchar
	description_module varchar
	order_module integer
	workload_module integer
	status_module varchar
}

Ref fk_user_uuid_enroll {
	user.uuid < enroll.uuid [ delete: no action, update: no action ]
}

Ref fk_course_uuid_enroll {
	course.uuid < enroll.uuid [ delete: no action, update: no action ]
}

Ref fk_user_uuid_result {
	user.uuid < result.uuid [ delete: no action, update: no action ]
}

Ref fk_discipline_uuid_avaliation {
	discipline.uuid < avaliation.uuid [ delete: no action, update: no action ]
}

Ref fk_avaliation_uuid_result {
	avaliation.uuid < result.uuid [ delete: no action, update: no action ]
}

Ref fk_subject_uuid_discipline {
	subject.uuid < discipline.uuid [ delete: no action, update: no action ]
}

Ref fk_course_uuid_module {
	course.uuid < module.uuid [ delete: no action, update: no action ]
}

Ref fk_module_uuid_discipline {
	module.uuid < discipline.uuid [ delete: no action, update: no action ]
}

Ref fk_user_uuid_progress {
	user.uuid < progress.uuid [ delete: no action, update: no action ]
}

Ref fk_module_uuid_progress {
	module.uuid < progress.uuid [ delete: no action, update: no action ]
}