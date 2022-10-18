package business;

import entities.Cherry;

public interface ICherryService {

	void Add(Cherry cherry, double kg);
	void Buy(Cherry cherry, double kg);
}
