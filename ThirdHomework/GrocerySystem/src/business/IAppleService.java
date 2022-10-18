package business;

import entities.Apple;

public interface IAppleService{

	void Add(Apple apple, double kg);
	void Buy(Apple apple, double kg)  throws Exception;
}
