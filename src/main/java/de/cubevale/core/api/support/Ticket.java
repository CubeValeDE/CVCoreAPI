package de.cubevale.core.api.support;

import de.cubevale.core.api.user.User;

import java.util.List;

public interface Ticket {

    int getId();

    long getCreationTime();

    User getCreator();

    void setCreator(User user);

    User getStaffMember();

    void setStaffMember(User user);

    List<User> getMembers();

    void addMember(User user);

    void removeMember(User user);

    String getDescription();

    void setDescription(String description);

    List<String> getAnswers();

    void addAnswer(int senderId, String message);


}
