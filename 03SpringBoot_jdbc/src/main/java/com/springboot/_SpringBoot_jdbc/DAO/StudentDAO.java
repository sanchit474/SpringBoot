package com.springboot._SpringBoot_jdbc.DAO;

import com.springboot._SpringBoot_jdbc.entity.Student;
import com.springboot._SpringBoot_jdbc.rowMapper.StudentRowMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class StudentDAO {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    // Inner class for mapping database rows to Student objects
//    private static final class StudentRowMapper implements RowMapper<Student> {
//        @Override
//        public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
//            return new Student(
//                    rs.getLong("id"),
//                    rs.getString("name"),
//                    rs.getString("branch"),
//                    rs.getString("address")
//            );
//        }
//    }


    public int insert(Student student) {
        try {
            String sql = "INSERT INTO student (id, name, branch, address) VALUES (?, ?, ?, ?)";
            return jdbcTemplate.update(sql,student.getId(), student.getName(), student.getBranch(), student.getAddress());
        }catch (Exception e){
            e.getMessage();
            return -1;
        }
    }


//    public Optional<Student> findById(Long id) {
//        String sql = "SELECT * FROM student WHERE id = ?";
//        try {
//            Student student = jdbcTemplate.queryForObject(sql, new StudentRowMapper(), id);
//            return Optional.ofNullable(student);
//        } catch (EmptyResultDataAccessException e) {
//            // This exception is thrown when queryForObject finds no rows
//            return Optional.empty();
//        }
//    }

//    public List<Student> findAll() {
//        String sql = "SELECT * FROM student";
//        return jdbcTemplate.query(sql, new StudentRowMapper());
//    }


    public int update(Student student) {
        try {
            String sql = "UPDATE student SET name = ?, branch = ?, address = ? WHERE id = ?";
            return jdbcTemplate.update(sql, student.getName(), student.getBranch(), student.getAddress(), student.getId());
        }catch (Exception e) {
            e.getMessage();
            return -1;
        }
    }

    public int delete(int id) {
        try {
            String sql = "DELETE FROM student WHERE id = ?";
            return jdbcTemplate.update(sql, id);
        }catch (Exception e){
            e.getMessage();
            return -1;
        }
    }
    public Optional<Student> findById(int id) {
        String sql = "SELECT * FROM student WHERE id = ?";
        try {
            Student student = jdbcTemplate.queryForObject(sql, new StudentRowMapper(), id);
            return Optional.ofNullable(student);
        } catch (EmptyResultDataAccessException e) {
            return Optional.empty();
        }
    }

    public List<Student> findAll() {
        String sql = "SELECT * FROM student";
        return jdbcTemplate.query(sql, new StudentRowMapper());
    }
}
