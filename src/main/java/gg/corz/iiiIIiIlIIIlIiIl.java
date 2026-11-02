package gg.corz;

import java.util.List;
import java.util.Locale;

public record iiiIIiIlIIIlIiIl(lllIliilillIliil selected, List<lllIliilillIliil> candidates, double ticksSaved, String reason) {
   private final String IIIIIliIll;
   private final List<lllIliilillIliil> liiiiIiIll;
   private final lllIliilillIliil IiiiiIiIll;
   private final double iiiiiIiIll;

   public lllIliilillIliil liiiIIllIl() {
      return this.IiiiiIiIll;
   }

   public double IilliliilIIi() {
      return this.iiiiiIiIll;
   }

   public String IliIlllilIi() {
      StringBuilder var1 = new StringBuilder();

      for (lllIliilillIliil var3 : this.liiiiIiIll) {
         if (var1.length() > 0) {
            var1.append(',');
         }

         var1.append(var3.iIlIlllllill())
            .append('(')
            .append(var3.iliIiiliiiii())
            .append('/')
            .append(
               String.format(
                  Locale.ROOT, iliIiiliiiii<"iliIiiliiiii","C6hUBVVKDzqTU93qGGDR4c946j2W1BAYwr20nKcEZUp8fBQUecMWkhg=">(), var3.IliIlllilIi(), var3.liiiIIllIl()
               )
            )
            .append(')');
      }

      return iliIiiliiiii<"iliIiiliiiii","wTA1xahpdlts9DwV6uGRUIDhP8LWhfL22nM+rXujzU9PH27AN2VvOEQFz4dx372G">()
         + var1
         + iliIiiliiiii<"iliIiiliiiii","4pJ9NVJK2gkUJVXi5DIeJT5lUO2ZulFhC8MTszExO87Hg1ImNGo=">()
         + (this.IiiiiIiIll == null ? iliIiiliiiii<"iliIiiliiiii","4kqJmkH20jWzir2wphXtNpRdBzkN9jGIBcaCxLYEg3Y=">() : this.IiiiiIiIll.iIlIlllllill())
         + iliIiiliiiii<"iliIiiliiiii","Ay6MSvsU4F+nVfferGaM+WqaumDI5h8c/Eea2G+pm7ZmjgaAkxC+4+KssmjumSxW">()
         + (this.IiiiiIiIll == null ? 0 : this.IiiiiIiIll.iliIiiliiiii())
         + String.format(
            Locale.ROOT,
            iliIiiliiiii<"iliIiiliiiii","HLkE9KcDLpDz2lsaYu6cS75Ygghjhp7lCw2HiHnm7pC5QXySgW7cd+FpURGi8jfDjti17DsLBh+rliO9umhBfMpGX8DqdZZLnFDxT6qJw3y+">(),
            this.IiiiiIiIll == null ? 0.0 : this.IiiiiIiIll.IliIlllilIi(),
            this.IiiiiIiIll == null ? 0.0 : this.IiiiiIiIll.liiiIIllIl(),
            this.iiiiiIiIll
         )
         + iliIiiliiiii<"iliIiiliiiii","O9ZXQGhgdUtAJohlSL27vGcr4RYnDw81Sq6uF2v/wOv2r2hs">()
         + this.IIIIIliIll;
   }

   public String lIiiIiIlilli() {
      return this.IIIIIliIll;
   }

   public List<lllIliilillIliil> iIlIlllllill() {
      return this.liiiiIiIll;
   }

   public iiiIIiIlIIIlIiIl(lllIliilillIliil selected, List<lllIliilillIliil> candidates, double ticksSaved, String reason) {
      this.IiiiiIiIll = selected;
      this.liiiiIiIll = candidates;
      this.iiiiiIiIll = ticksSaved;
      this.IIIIIliIll = reason;
   }
}
