package gg.corz;

import java.util.HashMap;
import java.util.Map;

public final class lilIiliilIil {
   public long IliliIlilliliIli;
   public long ililiIliIiiliIli;
   private final Map<lIliillliIliilll, ililiIlIiiliIl> lIiliIliiIiliIli = new HashMap<>();
   private static final int iilliIliIIiliIli = 256;
   public static final int IilliIlililliIli = 2;
   public static final double lllliIliillliIli = 0.6;

   public boolean iIlIlllllill(lIliillliIliilll key, long supportShapes) {
      ililiIlIiiliIl var4 = this.lIiliIliiIiliIli.get(key);
      return var4 != null && var4.IlIIIiillllIIIiill && var4.lIIIIiilliIIIIiill == supportShapes;
   }

   public String iliIiiliiiii() {
      return IIIllIIliIIl<"IIIllIIliIIl","3VQU0/WRlschBXdQJwTrSBLaTiWSkx0XnRtQmeR2rjz3UCdnnt10cXCdeQpX9qCH8y+0Kw==">()
         + this.IliliIlilliliIli
         + IIIllIIliIIl<"IIIllIIliIIl","eiuouHjyPtCEQZFp081E0QsCkHXHaX33Y3t7wTCoRF+6V8DUrwxXkYv4ZtqFDOkYOCg=">()
         + this.ililiIliIiiliIli
         + IIIllIIliIIl<"IIIllIIliIIl","H0ITl1M7mEy1jf6moJGqDb7qOGT87LpWaJr8tXDnQLiZ07eI2vMCRYdcsr3viSZA0w==">()
         + this.lIiliIliiIiliIli.size();
   }

   public int IilliliilIIi() {
      return this.lIiliIliiIiliIli.size();
   }

   public lillIiIiiillIiIi IliIlllilIi(lIliillliIliilll supportShapes, long key, double tick, int distance) {
      this.IliliIlilliliIli++;
      ililiIlIiiliIl var7 = this.lIiliIliiIiliIli.get(supportShapes);
      if (var7 == null) {
         if (this.lIiliIliiIiliIli.size() >= 256) {
            this.lIiliIliiIiliIli.clear();
         }

         var7 = new ililiIlIiiliIl();
         this.lIiliIliiIiliIli.put(supportShapes, var7);
      }

      if (var7.lIIIIiilliIIIIiill != key) {
         var7.lliiililliliiilill = 0;
         var7.Iiiiilillliiiilill = 0.0;
         var7.IlIIIiillllIIIiill = false;
         var7.lIIIIiilliIIIIiill = key;
      }

      var7.lliiililliliiilill++;
      var7.iiiiilillIIIIIiill = tick;
      var7.Iiiiilillliiiilill = Math.max(var7.Iiiiilillliiiilill, tick);
      var7.ilIIIiillIiIIIiill = distance;
      if (var7.IlIIIiillllIIIiill) {
         return lillIiIiiillIiIi.iiIiIIiIIi;
      } else if (var7.lliiililliliiilill < 2 && !(tick >= 0.6)) {
         return lillIiIiiillIiIi.IiIiIIiIIi;
      } else {
         var7.IlIIIiillllIIIiill = true;
         this.ililiIliIiiliIli++;
         return lillIiIiiillIiIi.liIiIIiIIi;
      }
   }

   public void lIiiIiIlilli() {
      this.lIiliIliiIiliIli.clear();
   }

   public ililiIlIiiliIl liiiIIllIl(lIliillliIliilll key) {
      return this.lIiliIliiIiliIli.get(key);
   }
}
