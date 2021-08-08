Câu 1. Ứng dụng web lúc lập trình chạy tốt, khi triển khai ở môi trường thật (production) có những yếu tố nào khiến nó chạy không đúng theo yêu cầu?
1 Do đường truyền mạng:
Đường truyền mạng quá xa cũng là nguyên nhân ảnh hưởng đến tốc độ truy cập.
Cách khắc phục: Xác định rõ nguồn truy cập website của mình chủ yếu từ đâu để lựa chọn vị trí đặt server và đường truyền mạng phù hợp.
2 Do Hosting:
Hosting cấu hình thấp.
Không được tối ưu.
Quá tải do nhiều người dùng.
Cách khắc phục: chọn một nhà cung cấp tin cậy, có cơ sở hạ tầng tốt, nhiều kinh nghiệm, uy tín và chất lượng.
3 Do hệ thống phân giải DNS:
Ta có sơ đồ hoạt động đơn giản như sau: yêu cầu từ máy tính (truy cập web) => Máy chủ mạng (cáp quang) => Máy chủ DNS tên miền => Server Hosting Rõ ràng máy chủ DNS cũng là một mắt xích trong sơ đồ hoạt động và có ảnh hưởng đến tốc dộ load của website.
4 Do website nhiễm mã độc, virus: Mã độc hoặc virus có thể làm treo cả server.
6 Do trình duyệt đang sử dụng:
Các trình duyệt khác nhau có tốc độ tải khác nhau. Nhất là kết nối chậm thì điều này càng phân biệt rõ rệt Khác nhau ở cốc cốc, chrome, Firefox, safari...
6 Do mở quá nhiều tab:
Nhiều tab gây quá tải CPU và hết Ram.
Nhiều tab đang kết nối khiến web chậm
7 Do máy tính chậm:
Trường hợp này thường xảy ra khi 2 máy cạnh nhau nhưng máy nhanh máy chậm. thường là do CPU, Ram và card mạng.
Do có nhiều lượng truy cập vào website.



Câu 2 Lập trình viên cần kiểm thử tốc độ (load test) vào giai đoạn nào của dự án?
Load Test phải được lập trình viên web nhận thức ngay trong quá trình thiết kế phát triển chứ không phải đến lúc triển khai hệ thống 

Câu 3 Thời gian phản hồi của trang ảnh hưởng thế nào đến trải nghiệm sử dụng của người dùng?
khi website load chậm đồng nghĩa với việc người dùng không đủ kiên nhẫn để chờ đợi => Tỷ lệ thoát trang cao, khiến website bị đánh giá là không hữu ích với người dùng.
Theo 1 cuộc điều tra về tốc độ load trang với người dùng đưa ra kết quả như sau:
47% người dùng muốn trang web load dưới 2 giây và 40% sẽ bỏ cuộc nếu trang web mất trên 3 giây để load.
79% người dùng sẽ không ghé thăm lại một website có performance tồi.
52% người dùng cho rằng website load nhanh ảnh hưởng trực tiếp đến độ trung thành của họ.
44% người dùng than phiền về tốc độ web với bạn của họ.
1 giây tăng lên trong load-time giảm 16% độ hài lòng của người dùng.

Câu 4 Giải thích các tham số trong lệnh kiểm thử sau đây 

hey -n 4000 -c 100 http://localhost:8080
-n 4000: Tổng số request được gửi từ client lên server
-c 100: Số request được gửi đồng thời từ client lên server
http://localhost:8080:
localhost (tên máy chủ) là tên máy hoặc địa chỉ IP của máy chủ lưu trữ, ví dụ Glassfish, Tomcat.
8080 (port) là địa chỉ của cổng mà máy chủ lưu trữ đang lắng nghe yêu cầu.

Câu 5 Những yếu tố nào khiến web site chậm?
- Nguyên nhân Chủ quan
Thứ nhất do code thiếu tối ưu, code thừa 
Thứ hai liên tục đọc từ ổ cứng, tốc độ đọc từ ssd chậm hơn so với ram 80-300 lần 
thứ ba Code dài dòng 
thứ tư Câu lệnh Sql không tối ưu, không đánh chỉ mục cột để tìm kiếm nhanh 
thứ năm chọn ngôn ngữ lập trình và web framework
Cuối cùng do Kiến trúc phân tán microservice không hợp lý gây chậm 
-Nguyên nhân khách quan 
thứ nhất Mạng bị ngẽn 
thứ hai băng thông từ khách hàng đến máy chủ chậm 


Câu 6 Làm sao để tăng tốc một Spring Boot web site? Cứ trả lời theo cách bạn nghĩ?
Tối ưu hóa toàn bộ code website cả về back-end và front-end
Về Back-End:
Hạn chế các câu lệnh để truy xuất qua lại giữa máy chủ (nơi chứa code website) và máy cục bộ (máy tính, thiết bị truy cập của khách hàng).
Thiết kế cơ sở dữ liệu đúng, hợp lý, có đánh chỉ mục để truy xuất dữ liệu nhanh hơn.
Dùng Caching để lưu lại những request hay được gọi về server giúp tăng tốc độ gửi request những lần tiếp theo.
Về Front-end:
Giảm hình ảnh, video dung lượng cao trên website.
Giảm thiểu việc tải nhiều file CSS, JavaScript, Internal CSS : Trình duyệt cho phép tải 8 file cùng lúc (8 connection) nên nếu website có quá nhiều hiệu ứng thì nên lược bớt đi.
Tránh sử dụng các Plugin không cần thiết: Plugin là một thành phần thêm vào website (thường thấy trong các nền tảng như wordpress,…) để giúp website mở rộng tính năng, đôi khi chính thành phần này góp phần làm cho website của bạn chạy chậm hơn, chính vì vậy nếu plugin nào không cần thiết thì nên gỡ nó đi
Thay thế các thẻ table bằng thẻ div: Các trang website được tổ chức với các thẻ TABLE sẽ làm giảm tốc độ tải trang hơn nhiều so với các trang được tổ chức với các thẻ DIV.
Có thể dùng plugin WP Minify Fix để nén tập tin JS và các tập tin CSS, làm cho chúng nhẹ hơn và cải thiện tốc độ load trang.

Câu 7 Phần khó nhất của caching là phần nào?
Phần khó nhất của caching chính là invalidate:
invalidate cache là việc xóa dữ liệu cũ, tính toán dữ liệu mới khi dữ liệu bị thay đổi. Phil Karlton đã từng nói: "There are only two hard problems in computer science: Cache invalidation and naming things." Qua câu nói trên đủ để thấy cache invalidation khó như thế nào.
Nếu để cache quá lâu thì dữ liệu sẽ bị stale, nếu refresh quá thường xuyên thì cache trở nên … vô dụng.
Để khắc phục vấn đề này ngừoi ta thường dùng các cơ chế write-xxx cache như sau:
Write-around: Application sẽ update data vào DB trước tiên, sau đó cache mới được update. Đây là cách thông dụng nhất và đáp ứng đa số ứng dụng khi chúng ta cần đảm bảo data được lưu trữ chuẩn xác trong DB. Người ta thường sử dụng 1 process phía sau (ví dụ 1 background job) để refresh cache sau khi action write xảy ra.
Write-through: Application sẽ update cache và DB cùng 1 lúc. Kiểu này làm action write kéo dài hơn write-around nhưng được cái vừa đảm bảo dữ liệu được ghi vào DB vừa đảm bảo data trong cache luôn tươi mới.
Write-behind: Application sẽ update vào cache trước, sau đó mới update data vào DB. Cách này là cách handle những ứng dụng có lượng write lớn và cho phép rủi ro liên quan tới tính toàn vẹn dữ liệu (kiểu các hệ thống counter, analytic, tracking,...) do data có thể mất mát khi chưa được lưu vào DB. Tuy nhiên đây là loại có action write nhanh nhất.


Câu 7 Giải thích annotation sau đây:

@EnableCaching Chú thích này kích hoạt một bộ xử lý hậu kỳ sẽ quét mọi Spring bean để tìm sự hiện diện của chú thích trong bộ nhớ đệm trên các phương thức công khai. Nếu không có chỉ định @EnableCaching thì @Cachable, @CachePut, @CacheEvict không hoạt động.
@Cacheable : các giá trị trả về sẽ được bổ sung cache. Đồng thời, khi truy vấn, nó sẽ được lấy từ bộ đệm trước và nếu không tồn tại, nó sẽ bắt đầu truy cập vào cơ sở dữ liệu.
@CachePut: sử dụng cho các việc bổ sung và sửa đổi dữ liệu trong cache.

@CachePut(value="books", key="id")

public Book updateBook(ID id, BookDetailDto bookDetail){

bookRepository.update(id, bookDetail);

return bookRepository.getBook(id);

}

=> Cập nhật thông tin sách theo id vào cache.
@CacheEvict: mỗi lần gọi hàm này nó sẽ xóa toàn bộ dữ liệu ở trong cache.

@CacheEvict(value = "books", allEntries=true)

public void clearCache() { }

=> Xóa toàn bộ dữ liệu sách ra khỏi cache.
Câu 8 Hãy copy đoạn lệnh giả lập trễ trong ví dụ mẫu vào đây
private void simulateSlowService() {

try {

  long time = 3000L; -> Thời gian trễ tự thiết lập (tính theo mili giây)
  
  Thread.sleep(time);

 } catch (InterruptedException e) {
  
 throw new IllegalStateException(e); 
}

}

}