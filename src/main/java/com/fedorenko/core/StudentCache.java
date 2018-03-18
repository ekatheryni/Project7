package com.fedorenko.core;

@Cacheable(cacheName = "studentsCache")
public Student getStudentById(int id){
        return jdbcTemplate.queryForObject(SQL_SELECT_STUDENT_BY_ID,
        new ParameterizedRowMapper<Student>() {
public Student mapRow(ResultSet rs, int rowNum) throws SQLException{
        Student student = new Student();
        student.setStudentId(rs.getInt(1));
        student.setPib(rs.getString(2));
        student.setCourse(rs.getInt(3));
        return student;}
        },
        id);
        }
}
