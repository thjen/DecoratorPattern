# Decorator Pattern

Mục đích của mẫu Decorator là `"gắn kết thêm một số tính năng cho đối tượng một cách linh động"`. Sử dụng `lớp con để mở rộng chức năng cho đối tượng`. Trong source code lớp Computer là lớp ban đầu, lớp ComponentDecorator là 1 abstract khai báo các thành phần bọc Computer. 

> **Note:** Đóng cho việc chỉnh sửa đổi, mở cho việc mở rộng.

```
	|-------------------------------------------------------|
	|	|--------------------------------------	|	|	
	|	|	|-----------------------|	|	|		
	|	|	|	Computer	|	|	|					
	|	|	|	description()	|	|	|
	|	|	|-----------------------|	|	|	
	|	|					|	|
	|	|		Disk			|	|	
	|	|		description()		|	|
	|	|--------------------------------------	|	|
	|							|
	|			Monitor				|	
	|			description()			|
	|-------------------------------------------------------|
```

