package site.metacoding.quest1.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Header {
    private String resultCode;
    private String resultMsg;
}
