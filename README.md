# JavaTeamProject

TItle: Inventory Stock System for Bakery

  
  
  Project member: 22500454 윤세나, 22500738 최이나
  
  link: https://youtu.be/kHrKCI7Fy4Q
  

개인 베이커리샵을 위한 상품 재고 관리 리스트 시스템으로 상품을 목록화하여 분류함과 동시에 각 상품의 개별 정보를 관리, 리스트화하여 재고관리의 편의를 위한 프로그램이다. 상품 재고의 관리와 카테고리별 판매량, 총 판매량 등을 가독성있게 확인할 수 있으며 메뉴의 추가 삭제등 리스트 기능이 가능하다. 빵 제작 개수 계산의 정확도를 증가시키기위한 보조 프로그램으로도 사용이 가능하다. 베이커리 셀링 메인 클래스를 헤더로 디저트 클래스, 브래드 클래스를 배치해 각 클래스에 개별 재고를 속하게 한다.

This is a product inventory management list system for personal bakeries designed to facilitate inventory management by cataloging and classifying products while simultaneously managing and listing individual product information. It allows for the readable viewing of product inventory, sales volume by category, and total sales, and enables list functions such as adding and deleting menu items. It can also be used as an auxiliary program to increase the accuracy of calculating bread production quantities. The Bakery Selling Main Class serves as the header, with Dessert and Bread classes arranged to assign individual inventory to each class.

<img width="774" height="841" alt="Bakery System drawio" src="https://github.com/user-attachments/assets/9e3ee321-18f5-4fb7-a11c-263ca895c34b" />

베이커리 셀링 메인 시스템(Bakery Selling Main System)
-잔체 재고량(Total Stock)
-전체 판매량(Total Sales)


디저트(Dessert)
-전체 재고량(Total Category Stock)
-전체 판매량(Total Category Sales)

-케이크(Cake)
  -이름(Name)
  -가격(Price)
  -무게(Weight)
  -조각/홀(Type: Piece/Whole)
  -사이즈(Size)
  -재고수량(Stock Quantity)
  -판매량 (Sales)

-핑거푸드(Pinger Food)
  -이름(Name)
  -가격(Price)
  -무게(Weight)
  -재고수량(Stock Quantity)
  -판매량(Sales)


브레드(Bread)
-잔체 재고량(Total Category Stock)
-전체 판매량(Total Category Sales)

-밀 브레드(Meal Bread)
  -이름(Name)
  -가격(Price)
  -무게(Weight)
  -재고수량(Stock Quantity)
  -판매량(Sales)
-논밀 브레드(Non-meal Bread)
  -이름(Name)
  -가격(Price)
  -무게(Weight)
  -재고수량(Stock Quantity)
  -판매량(Sales)

