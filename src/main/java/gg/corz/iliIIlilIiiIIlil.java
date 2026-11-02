package gg.corz;

import java.util.ArrayDeque;

public final class iliIIlilIiiIIlil {
   public static final long iliiiilIil = 3000L;
   public static final long IiiiiilIil = 60000L;
   private boolean IllIIIiIil;
   public static final long IlIIIIiIil = 10000L;
   public static final int liiiiilIil = 4;
   public static final long[] IiIIIIiIil = new long[]{
      -7343369751042175236L ^ -7343369751042168340L,
      3045759035658474667L ^ 3045759035658492555L,
      4781613453699184659L ^ 4781613453699146835L,
      -4934892325577565756L ^ -4934892325577608284L
   };
   private long iilIIIiIil;
   private long illIIIiIil;
   public static final long IIIIIIiIil = 15000L;
   private long lllIIIiIil;
   public static final long iiIIIIiIil = 5000L;
   private long IilIIIiIil;
   private static final long lIlIIIiIil = -2305843009213693952L;
   private long lilIIIiIil;
   public static final long llIIIIiIil = 1500L;
   public static final int liIIIIiIil = 5;
   private int lIiIIIiIil;
   public static final long IIlIIIiIil = 600000L;
   public static final long iIIIIIiIil = 400L;
   private boolean iIiIIIiIil;
   private int IIiIIIiIil;
   public static final long lIIIIIiIil = 600L;
   public static final long iiiiiilIil = 12000L;
   private final ArrayDeque<Long> iIlIIIiIil = new ArrayDeque<>();
   public static final long ilIIIIiIil = 3000L;

   public void Illlllllilll(long now, long ms) {
      this.IllIIIiIil = false;
      this.iIiIIIiIil = false;
      this.lIiIIIiIil = 0;
      if (ms < (8019029555044498736L ^ 8019029555044498736L)) {
         this.IilIIIiIil = Math.max(this.IilIIIiIil, now + this.Iilililiiili());
      } else {
         this.IIiIIIiIil = 0;
         this.IilIIIiIil = Math.max(now + 1L, now + ms + (-7333498237058030291L ^ -7333498237058029707L));
         if (this.lilIIIiIil != (-977779431869875821L ^ 1328063577343818131L)) {
            this.iilIIIiIil = IIiilIiiiIii(now - this.lilIIIiIil + ms);
         }
      }
   }

   public boolean iIlIlllllill(long now) {
      return !this.IllIIIiIil && now >= this.IilliliilIIi(now);
   }

   public void IIillIiliIil(long now) {
      this.IllIIIiIil = false;
      this.iIiIIIiIil = false;
      this.IilIIIiIil = Math.max(this.IilIIIiIil, now + (887516126486802414L ^ 887516126486800946L));
   }

   private long Iilililiiili() {
      long var1 = IiIIIIiIil[Math.min(this.IIiIIIiIil, IiIIIIiIil.length - 1)];
      this.IIiIIIiIil++;
      return var1;
   }

   public long IIlilIliiIli() {
      return this.lilIIIiIil;
   }

   public void IlIlllIlilIl(long now) {
      this.Iliilliiilii(now);
      this.iIlIIIiIil.addLast(now);
      this.illIIIiIil = now;
      this.IllIIIiIil = true;
      this.iIiIIIiIil = false;
      this.lllIIIiIil = now + (-2673080489143184656L ^ -2673080489143174128L);
   }

   public boolean iliIiiliiiii() {
      return this.iIiIIIiIil;
   }

   public int Illillliilli(long now) {
      this.Iliilliiilii(now);
      return this.iIlIIIiIil.size();
   }

   public long IilliliilIIi(long now) {
      this.Iliilliiilii(now);
      long var3 = Math.max(this.IilIIIiIil, this.illIIIiIil + (1559159661586760679L ^ 1559159661586761823L));
      if (this.iIlIIIiIil.size() >= ((-1367259710 ^ 95) * 41 ^ -223074783)) {
         var3 = Math.max(var3, this.iIlIIIiIil.peekFirst() + (5357591248828045786L ^ 5357591248828101562L));
      }

      return var3;
   }

   public void IliIlllilIi() {
      this.iIlIIIiIil.clear();
      this.IllIIIiIil = false;
      this.lllIIIiIil = 2364269821394107092L ^ -4553259206246974764L;
      this.illIIIiIil = -5132168823301245290L ^ 6397046222767224470L;
      this.IilIIIiIil = 8520216282435539485L ^ -7620684782060318179L;
      this.lilIIIiIil = 1001294528855976149L ^ -1304548480357717803L;
      this.iilIIIiIil = -1L;
      this.IIiIIIiIil = 0;
      this.lIiIIIiIil = 0;
      this.iIiIIIiIil = false;
   }

   public void Iilllilliill(long now) {
      this.IllIIIiIil = false;
      this.iIiIIIiIil = false;
      this.lIiIIIiIil = 0;
      this.IilIIIiIil = Math.max(this.IilIIIiIil, now + (-6510174587932183902L ^ -6510174587932191310L));
   }

   private static long IIiilIiiiIii(long ms) {
      return Math.max(-2601969015028148239L ^ -2601969015028153223L, Math.min(6609387544332495426L ^ 6609387544333077890L, ms));
   }

   public void Ililllililil(long now) {
      this.IllIIIiIil = false;
      this.iIiIIIiIil = false;
      this.lIiIIIiIil = 0;
      this.IilIIIiIil = Math.max(this.IilIIIiIil, now + (-4476810558578486480L ^ -4476810558578485112L));
   }

   private void Iliilliiilii(long now) {
      while (!this.iIlIIIiIil.isEmpty() && now - this.iIlIIIiIil.peekFirst() >= 60000L) {
         this.iIlIIIiIil.removeFirst();
      }
   }

   public long IIIllIIliIIl(long now) {
      return this.IllIIIiIil ? Math.max(0L, this.lllIIIiIil - now) : Math.max(0L, this.IilliliilIIi(now) - now);
   }

   public boolean IIlllIlliIll(long now) {
      return this.IllIIIiIil && now >= this.lllIIIiIil;
   }

   public boolean lIiiIiIlilli(long now) {
      if (!this.IllIIIiIil && this.iIiIIIiIil) {
         this.Iliilliiilii(now);
         return now >= this.illIIIiIil + (-6331169161140395199L ^ -6331169161140393735L)
            && this.iIlIIIiIil.size() < (~(664870204 - -77) - 83 - 43 ^ -664870404);
      } else {
         return false;
      }
   }

   public boolean IIIilIIiiIIi(long now) {
      this.IllIIIiIil = false;
      this.iIiIIIiIil = false;
      this.lIiIIIiIil++;
      this.IilIIIiIil = Math.max(this.IilIIIiIil, now + this.Iilililiiili());
      return this.lIiIIIiIil >= (((~226737891 << 7 | ~226737891 >>> 25) >>> 9 | (~226737891 << 7 | ~226737891 >>> 25) << 23) * 1059797125 ^ 2132802790);
   }

   public iliIIlilIiiIIlil() {
      this.lllIIIiIil = -7041823585032949386L ^ 9099077479462908278L;
      this.illIIIiIil = -2490828668463012500L ^ 4426700359178069356L;
      this.IilIIIiIil = 6500978674226427172L ^ -5028236371842042588L;
      this.lilIIIiIil = 3325358545774805996L ^ -3592170481866275860L;
      this.iilIIIiIil = -1L;
   }

   public void Iiilliiliiil(long now) {
      this.IllIIIiIil = false;
      this.lIiIIIiIil = 0;
      this.IIiIIIiIil = 0;
      this.lilIIIiIil = now;
      this.iIiIIIiIil = this.iilIIIiIil > (5952066969463829611L ^ 5952066969463829611L);
      this.IilIIIiIil = this.iIiIIIiIil
         ? now + this.iilIIIiIil + (-7164778136764362271L ^ -7164778136764362639L)
         : 5696472800630003576L ^ -5832742245438466184L;
   }

   public void IiIlliIliiIl(long now) {
      if (this.IllIIIiIil) {
         this.lllIIIiIil = Math.max(this.lllIIIiIil, now + 15000L);
      }

      this.lIiIIIiIil = 0;
   }

   public boolean liiiIIllIl() {
      return this.IllIIIiIil;
   }

   public int IlIillIiilIi() {
      return this.lIiIIIiIil;
   }

   public long IiIiliIiiiIi() {
      return this.iilIIIiIil;
   }
}
