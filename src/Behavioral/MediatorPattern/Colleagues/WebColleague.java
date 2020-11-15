package Behavioral.MediatorPattern.Colleagues;

import Behavioral.MediatorPattern.Colleague;
import Behavioral.MediatorPattern.IMediator;

/**
 * @author Bishwa on 04/11/2020
 */
public class WebColleague extends Colleague {
    public WebColleague(IMediator mediator) {
        super(mediator);
    }

    @Override
    public void receive(String message) {
        System.out.println("Web received message");
    }
}
