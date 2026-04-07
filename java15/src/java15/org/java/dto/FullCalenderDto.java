package java15.org.java.dto;

import java.time.LocalDateTime;

public class FullCalenderDto {
	private LocalDateTime startDay;
	private LocalDateTime endDay;
	
	public FullCalenderDto() {
		// TODO Auto-generated constructor stub
	}

	public FullCalenderDto(LocalDateTime startDay, LocalDateTime endDay) {
		super();
		this.startDay = startDay;
		this.endDay = endDay;
	}

	public LocalDateTime getStartDay() {
		return startDay;
	}

	public void setStartDay(LocalDateTime startDay) {
		this.startDay = startDay;
	}

	public LocalDateTime getEndDay() {
		return endDay;
	}

	public void setEndDay(LocalDateTime endDay) {
		this.endDay = endDay;
	}

	@Override
	public String toString() {
		return "예약시간:  [예약시작일=" + startDay + ", 예약종료일=" + endDay + "]";
	}
	
}
