# doesn't actually print, it actually just returns a string
def self.print(result)
  unless result.is_a?(Array) then return result.to_s end
  out = ""
  result.each do |entry|
    entry.each do |k,v|
      out = out + k + ": " + v + " "
    end
    out = out + "\n"
  end
  out
end
