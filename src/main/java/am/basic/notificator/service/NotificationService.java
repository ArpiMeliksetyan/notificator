package am.basic.notificator.service;


import am.basic.notificator.model.exceptions.AccessDeniedException;
import am.basic.notificator.model.exceptions.NotFoundException;
import am.basic.notificator.model.lcp.Notification;

import java.util.List;

public interface NotificationService {

    Notification add(Notification notification);

    Notification update(Notification notification, long id) throws NotFoundException, AccessDeniedException;

    void delete(int userId, long id) throws NotFoundException;

    List<Notification> getByUserId(int userId);

    List<Notification> getReadyNotifications();


    void sendNotification(Notification notification) throws InterruptedException;

}
