package gg.corz;

import java.util.LinkedHashMap;
import java.util.Map;

public final class liilIiiliiilIiil {
   public static final int iIllIIilil = 1;
   private int llllIIilil;
   private int IillIIilil;
   private final Map<iiiiilIIIIIi, IIiIIIllIiIIIl> IlllIIilil = new LinkedHashMap<>();
   private int illlIIilil;
   public static final int lIllIIilil = 0;

   public boolean iIlIlllllill(iiiiilIIIIIi c, long geometryFingerprint) {
      if (c == null) {
         return false;
      } else {
         IIiIIIllIiIIIl var4 = this.IlllIIilil.get(c);
         if (var4 == null) {
            return false;
         } else if (var4.IliIlllilIi() != geometryFingerprint) {
            this.IlllIIilil.remove(c);
            return false;
         } else {
            this.illlIIilil++;
            return true;
         }
      }
   }

   public int lIiiIiIlilli() {
      return this.IillIIilil;
   }

   public static int IliIlllilIi(double v, double u) {
      return v >= 0.3 && v <= 0.7 && u >= 0.3 && u <= 0.7 ? 0 : 1;
   }

   public int IIIllIIliIIl() {
      return this.IlllIIilil.size();
   }

   public void liiiIIllIl(iiiiilIIIIIi tick, long geometryFingerprint, int c) {
      if (tick != null) {
         this.IillIIilil++;
         if (this.IlllIIilil.put(tick, new IIiIIIllIiIIIl(geometryFingerprint, c)) == null) {
            this.llllIIilil++;
         }
      }
   }

   public void IlIlllIlilIl() {
      this.IlllIIilil.clear();
      this.llllIIilil = 0;
      this.illlIIilil = 0;
      this.IillIIilil = 0;
   }

   public int IilliliilIIi() {
      return this.llllIIilil;
   }

   public int iliIiiliiiii() {
      return this.illlIIilil;
   }

   public String IiIlliIliiIl() {
      return IIlllIlliIll<"IIlllIlliIll","fzMOyUI+/IbAWVh0lcxc3nNZmaWxm5OP/TBZqEIdRTjf+ad0WcI=">()
         + this.llllIIilil
         + IIlllIlliIll<"IIlllIlliIll","OihGlyAZXyI9TSKNBJSUt0+IniHgmn0h9gXZpdiplFa0LCcsMyY=">()
         + this.IillIIilil
         + IIlllIlliIll<"IIlllIlliIll","xcpm3gfTWvruQu7RvLboJW5ScOMXHJ4GF7XzGH4Ii0nYQsQZlQ==">()
         + this.illlIIilil
         + IIlllIlliIll<"IIlllIlliIll","iTm1JqP8z5Xp9nvIwloGvp89O9uQN5Aqz3UjWw020RInpQ==">()
         + this.IlllIIilil.size();
   }
}
