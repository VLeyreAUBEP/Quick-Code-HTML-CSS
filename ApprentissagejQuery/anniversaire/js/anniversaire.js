function getRandomColor() {
  const letters = '0123456789ABCDEF';
  let color = '#';
  for (var i = 0; i < 6; i++) {
    color += letters[Math.floor(Math.random() * 16)];
  }
  return color;
}

$(function() {
  
  let $list, $newItemForm;
  $list = $('ul');
  $newItemForm = $('#newItemForm');
  
  let i = Number(0);
  $newItemForm.on('submit', function(event) {
    event.preventDefault();
    let text = $('input:text').val();
    $list.append('<li>' + text + '</li>');
    $('li:last').attr('id', `${i++}`);
    $('li:last').css('background-color', getRandomColor());
    
    if($("li:last")[0].id == "2") {
      $('body').css('background-image', 'url(\"images/congratulations.jpg\")');  
      $('body').css('background-size', 'cover');
      $('body').css('background-repeat', 'no-repeat');
      $('body').css('background-position', 'center');
    }
    $('input:text').val('');
  });

  $list.on('click', 'li', function() {
    let $this = $(this);
    $this.remove();
  });

});