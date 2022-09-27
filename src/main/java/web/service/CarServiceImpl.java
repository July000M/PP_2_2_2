package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarServiceImpl implements CarService {

    @Override
    public List<Car> getCars(List <Car> list, int number) {
        if(number <= 0){
            return new ArrayList<>();
        }
        if ( number >= 5 ) {
            return list;
        }
        return list.stream().limit(number).toList();
    }
}

