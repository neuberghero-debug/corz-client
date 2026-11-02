package gg.corz;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public record ilIililIiIilil(int trueLowestUnfinishedY, int effectiveWorkLayerY, int lookahead, int playerFeetY, long componentKey, int componentSize, int tick) {
   private final long IiiIllIliliiIllIli;
   public static final ilIililIiIilil ilIlllIliIiIlllIli = new ilIililIiIilil(Integer.MIN_VALUE, Integer.MIN_VALUE, 3, Integer.MIN_VALUE, 0L, 0, -1);
   private final int lIIlllIliiIIlllIli;
   private final int lilIllIliiilIllIli;
   private final int IIiIllIlilIiIllIli;
   private final int iIiIllIliIliIllIli;
   public static final int IlIlllIlillIlllIli = 3;
   private final int iiiIllIliIIIlllIli;
   private final int lliIllIliiliIllIli;

   public List<Integer> IilliliilIIi() {
      long var3 = 3569978863858968660L;
      ArrayList var1 = new ArrayList();
      if (!this.IliIlllilIi()) {
         return var1;
      } else {
         var1.add(this.IIiIllIlilIiIllIli);
         if (this.lilIllIliiilIllIli != Integer.MIN_VALUE) {
            for (long var5 = var3 ^ ((long)(this.IIiIllIlilIiIllIli - 1) << 32 ^ var3) & -1L << 32;
               (int)(var5 >>> 32) >= this.lilIllIliiilIllIli && var1.size() < 6;
               var5 += -4294967296L
            ) {
               var1.add((int)(var5 >>> 32));
            }
         }

         return var1;
      }
   }

   public long IIlllIlliIll() {
      return this.IiiIllIliliiIllIli;
   }

   public int IiIlliIliiIl() {
      return this.lliIllIliiliIllIli;
   }

   public int IlIlllIlilIl() {
      return this.iIiIllIliIliIllIli;
   }

   public int Iilllilliill() {
      return this.lIIlllIliiIIlllIli;
   }

   public int Illlllllilll() {
      return this.iiiIllIliIIIlllIli;
   }

   public ilIililIiIilil(int trueLowestUnfinishedY, int effectiveWorkLayerY, int lookahead, int playerFeetY, long componentKey, int componentSize, int tick) {
      this.lilIllIliiilIllIli = trueLowestUnfinishedY;
      this.IIiIllIlilIiIllIli = effectiveWorkLayerY;
      this.iIiIllIliIliIllIli = lookahead;
      this.lliIllIliiliIllIli = playerFeetY;
      this.IiiIllIliliiIllIli = componentKey;
      this.iiiIllIliIIIlllIli = componentSize;
      this.lIIlllIliiIIlllIli = tick;
   }

   public boolean IliIlllilIi() {
      return this.IIiIllIlilIiIllIli != Integer.MIN_VALUE;
   }

   public ilIililIiIilil liiiIIllIl(IiillIilliillIil live) {
      return new ilIililIiIilil(
         this.lilIllIliiilIllIli,
         this.IIiIllIlilIiIllIli,
         this.iIiIllIliIliIllIli,
         live.IliIlllilIi(),
         live.IIIllIIliIIl(),
         live.IlIlllIlilIl(),
         live.IIlllIlliIll()
      );
   }

   public boolean iIlIlllllill() {
      return this.IliIlllilIi() && this.lilIllIliiilIllIli != Integer.MIN_VALUE && this.IIiIllIlilIiIllIli > this.lilIllIliiilIllIli;
   }

   public int IIIllIIliIIl() {
      return this.IIiIllIlilIiIllIli;
   }

   public int iliIiiliiiii() {
      return this.lilIllIliiilIllIli;
   }

   public String lIiiIiIlilli() {
      return String.format(
         Locale.ROOT,
         IIillIiliIil<"IIillIiliIil","1mdxL5p9I/PZuuzNhtDduRAld1xg60Yn+AqGKwM4IwjxINcFcF9yQP4VOTOsrxHj0CM8UWPB3zHz+MYe6IQpUp1sPr16fPtC5+L1kKbT5gFqZY5RLfAVWz4=">(),
         this.lilIllIliiilIllIli,
         this.IIiIllIlilIiIllIli,
         this.IilliliilIIi(),
         this.lliIllIliiliIllIli,
         this.IiiIllIliliiIllIli,
         this.iiiIllIliIIIlllIli
      );
   }
}
