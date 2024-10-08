package com.myhandjava.momentours.randomquestion.command.application.service;

import com.myhandjava.momentours.randomquestion.command.application.dto.RandomQuestionDTO;
import com.myhandjava.momentours.randomquestion.command.application.dto.RandomReplyDTO;

public interface RandomQuestionAndReplyService {
    void removeRandomReply(int replyNo);
    void updateRandomReply(int replyNo, RandomReplyDTO modifyContent);
    void registRandomReply(RandomReplyDTO randomReplyDTO) throws Exception;
    RandomQuestionDTO getCurrentRandomQuestion(int coupleNo);
    RandomQuestionDTO saveNewQuestion(int coupleNo, String content) throws Exception;
}
