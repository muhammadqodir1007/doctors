package com.alibou.security.quiz.article;

import java.util.List;

public interface UserQuizService {


    List<UserQuiz> findAll();
    List<UserQuiz> findAllByUserId(Long id);

    UserQuiz findById(Long id);

    UserQuiz create(UserQuizDto userQuizDto);

    UserQuiz update(Long userTestId, UserQuizDto userQuizDto);

    void delete(Long id);
}
