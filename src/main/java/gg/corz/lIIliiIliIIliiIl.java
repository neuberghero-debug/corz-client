package gg.corz;

import java.util.HashMap;
import java.util.Map;

public final class lIIliiIliIIliiIl {
   private final Map<lliiIIililiiIIil, Integer> ilIIllIlll = new HashMap<>();
   private int liIIllIlll = -1;
   private int IiIIllIlll;
   private long iiIIllIlll = Long.MIN_VALUE;

   public int IliIlllilIi(lliiIIililiiIIil tick, int signature) {
      if (tick.iliIiiliiiii() > this.liIIllIlll || tick.lIiiIiIlilli() != this.iiIIllIlll) {
         this.ilIIllIlll.clear();
         this.IiIIllIlll = signature;
         this.liIIllIlll = tick.iliIiiliiiii();
         this.iiIIllIlll = tick.lIiiIiIlilli();
      }

      return this.ilIIllIlll.size() >= 128 && !this.ilIIllIlll.containsKey(tick) ? 2 : this.ilIIllIlll.merge(tick, 1, Integer::sum);
   }

   public void iIlIlllllill() {
      this.ilIIllIlll.clear();
      this.liIIllIlll = -1;
      this.iiIIllIlll = Long.MIN_VALUE;
      this.IiIIllIlll = 0;
   }

   public int liiiIIllIl(int tick) {
      return Math.max(0, tick - this.IiIIllIlll);
   }
}
