// export function func(cityId)  {
//     $(document).ready(function () {
//         $('#town-select').change(function () {
//             let cityId = $(this).val();
//             <option value="">-- Select a neighborhood --</option>);
//             if (cityId) {
//                 $.ajax({
//                     url: '/neighborhoods',
//                     type: 'get',
//                     data: {townId: townId},
//                     success: function (response) {
//                         let neighborhoodSelect = $('#neighborhood-select');
//                         neighborhoodSelect.empty();
//                         neighborhoodSelect.append('<option value="">-- Select a neighborhood --</option>').append(
//                         $.each(response, function (index, neighborhood) {
//                             neighborhoodSelect.append('<option value="' + neighborhood.id + '">' + neighborhood.name + '</option>');
//                         });
//                     },
//                     error: function (xhr, status, error) {
//                         console.error(xhr.responseText);
//                     }
//                 });
//             }
//             else
//             {
//                 $('#neighborhood-select').empty();
//             }
//         });
//     });
// }
