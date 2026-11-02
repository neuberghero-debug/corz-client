package gg.corz;

import java.util.List;

public final class iliIIIiIiiIIIi<K> {
   public final int illIiIiliIilIiIili;
   public final long IllIiIililllIiIili;
   public final int lilIiIiliiilIiIili;
   public final List<IiIlliilliIlliil<K>> lIlIiIiliiIlIiIili;

   iliIIIiIiiIIIi(List<IiIlliilliIlliil<K>> pricedTypes, long unpricedTypes, int total, int lines) {
      this.lIlIiIiliiIlIiIili = pricedTypes;
      this.IllIiIililllIiIili = unpricedTypes;
      this.illIiIiliIilIiIili = total;
      this.lilIiIiliiilIiIili = lines;
   }

   public IiIlliilliIlliil<K> liiiIIllIl() {
      IiIlliilliIlliil var1 = null;

      for (IiIlliilliIlliil var3 : this.lIlIiIiliiIlIiIili) {
         if (var3.lliIIiilil && var3.IliIIiilil > 0L && (var1 == null || var3.IliIIiilil > var1.IliIIiilil)) {
            var1 = var3;
         }
      }

      return var1;
   }

   public int IliIlllilIi() {
      return this.illIiIiliIilIiIili + this.lilIiIiliiilIiIili;
   }
}
