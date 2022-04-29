package site.metacoding.quest1.web;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import lombok.RequiredArgsConstructor;
import site.metacoding.quest1.domain.ResponseDto;
import site.metacoding.quest1.service.WeatherService;

@RequiredArgsConstructor
@Controller
public class WeatherController {

    private final WeatherService weatherService;

    @GetMapping("/down")
    public String download() {
        return "main";
    }

    @GetMapping("/api/down/{id}")
    public ResponseEntity<?> down(@PathVariable Integer id) {
        ResponseDto responseDto = weatherService.다운로드(id);
        return new ResponseEntity<>(responseDto, HttpStatus.OK);
    }

}
