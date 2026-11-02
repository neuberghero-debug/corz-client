package gg.corz;

import java.util.ArrayDeque;

public final class Illliilllllliill {
   private long IliIliiill;
   static final double illIliiill = 10.0;
   static final int lllIliiill = 2;
   private long llIlliiill;
   private boolean iIiIliiill;
   static final long IiIIliiill = 2000L;
   private final ArrayDeque<Long> IIllliiill;
   private long liiIliiill;
   private boolean ilIlliiill;
   static final int iIlIliiill = 3;
   static final long liIIliiill = 1500L;
   static final long lIlIliiill = 10000L;
   private Object lIiIliiill;
   private Object lliIliiill;
   static final long iilIliiill = 1000L;
   private illiIiilIiliIiil liIlliiill;
   static final long IIiIliiill = 250L;
   static final int lilIliiill = 3;
   static final double IilIliiill = 12.0;
   private long IIIlliiill = -1L;
   private long IiiIliiill;
   private long iIIlliiill;
   private long iiiIliiill;
   static final int IllIliiill = 6;
   static final long iiIIliiill = 3000L;
   static final long IIlIliiill = 350L;
   private long lIIlliiill = -1L;
   private boolean IlIlliiill;
   private Object iliIliiill;
   private final ArrayDeque<Long> iiIlliiill = new ArrayDeque<>();
   private boolean IiIlliiill;

   private void IIlllIlliIll(long setbackMs) {
      long var4 = 947887147590319446L;
      if (setbackMs >= 0L && setbackMs >= this.iiiIliiill) {
         var4 ^= ((long)(setbackMs > this.iiiIliiill ? 1 : 0) << 32 ^ var4) & -1L << 32;
         this.iiiIliiill = setbackMs;
         if (setbackMs != this.lIIlliiill && this.Illlllllilll(setbackMs)) {
            this.Iilllilliill(setbackMs);
         } else if ((int)(var4 >>> 32) != 0 && setbackMs - this.IliIliiill >= 3000L) {
            this.IIllliiill.addLast(setbackMs);
         }
      }
   }

   public illiIiilIiliIiil iIlIlllllill(iIlIllIiIllIllIi p) {
      if (this.liIlliiill != null) {
         return this.liIlliiill;
      } else {
         long var2 = p.IliIlllilIi();
         if (this.lIiIliiill != null && p.iIlIlllllill() == this.lIiIliiill) {
            IIillIiliIil(this.iiIlliiill, var2);
            if (this.iiIlliiill.size() >= 3) {
               return this.Ililllililil(iiiiiiIlIIIIIIll.lliIliIlll, false);
            } else {
               this.IlIlllIlilIl(p);
               if (this.iIiIliiill) {
                  this.iIiIliiill = false;
                  this.lliIliiill = p.IilliliilIIi();
                  this.iliIliiill = p.lIiiIiIlilli();
                  this.iiiIliiill = p.IiIlliIliiIl();
                  return Iiilliiliiil(iiiiiiIlIIIIIIll.iIIIliIlll, "", true);
               } else {
                  long var4 = p.IiIlliIliiIl();
                  if (p.IilliliilIIi() == this.lliIliiill && p.lIiiIiIlilli() == this.iliIliiill) {
                     this.IIlllIlliIll(var4);
                  } else {
                     this.iiiIliiill = Math.max(this.iiiIliiill, var4);
                  }

                  IIillIiliIil(this.IIllliiill, var2);
                  if (this.IIllliiill.size() >= 6) {
                     return this.Ililllililil(iiiiiiIlIIIIIIll.IliIliIlll, false);
                  } else if (p.IilliliilIIi() != this.lliIliiill) {
                     this.lliIliiill = p.IilliliilIIi();
                     this.iliIliiill = p.lIiiIiIlilli();
                     this.IiiIliiill = var2 + 2000L;
                     this.IliIliiill = var2;
                     return Iiilliiliiil(iiiiiiIlIIIIIIll.iiIIliIlll, "", true);
                  } else if (var2 < this.IiiIliiill) {
                     return Iiilliiliiil(iiiiiiIlIIIIIIll.iiIIliIlll, "", false);
                  } else if (!p.iliIiiliiiii()) {
                     return Iiilliiliiil(iiiiiiIlIIIIIIll.IiIIliIlll, "", false);
                  } else if (p.lIiiIiIlilli() != this.iliIliiill) {
                     this.iliIliiill = p.lIiiIiIlilli();
                     this.liiIliiill = var2 + 1500L;
                     this.IliIliiill = var2;
                     return Iiilliiliiil(iiiiiiIlIIIIIIll.liIIliIlll, "", true);
                  } else if (var2 < this.liiIliiill) {
                     return Iiilliiliiil(iiiiiiIlIIIIIIll.liIIliIlll, "", false);
                  } else if (p.IIIilIIiiIIi() != null) {
                     return Iiilliiliiil(iiiiiiIlIIIIIIll.illIliIlll, p.IIIilIIiiIIi(), false);
                  } else if (p.IlIillIiilIi() != null) {
                     return Iiilliiliiil(iiiiiiIlIIIIIIll.IilIliIlll, p.IlIillIiilIi(), false);
                  } else if (this.IlIlliiill) {
                     return Iiilliiliiil(iiiiiiIlIIIIIIll.IlIIliIlll, "", false);
                  } else if (p.IlIlllIlilIl()) {
                     return Iiilliiliiil(iiiiiiIlIIIIIIll.ilIIliIlll, "", false);
                  } else if (p.Ililllililil()) {
                     return Iiilliiliiil(iiiiiiIlIIIIIIll.llIIliIlll, "", false);
                  } else if (p.Iiilliiliiil()) {
                     return Iiilliiliiil(iiiiiiIlIIIIIIll.lllIliIlll, "", false);
                  } else if (p.IiIiliIiiiIi()) {
                     return Iiilliiliiil(iiiiiiIlIIIIIIll.lilIliIlll, "", false);
                  } else if (p.IIlilIliiIli()) {
                     return Iiilliiliiil(iiiiiiIlIIIIIIll.iilIliIlll, "", false);
                  } else if (p.Illillliilli()) {
                     return Iiilliiliiil(iiiiiiIlIIIIIIll.IIiIliIlll, "", false);
                  } else if (this.ilIlliiill) {
                     return Iiilliiliiil(iiiiiiIlIIIIIIll.lIlIliIlll, "", false);
                  } else if (var4 >= 0L && var4 != this.lIIlliiill && var2 - var4 < 350L) {
                     return new illiIiilIiliIiil(IiIIilllliIIilll.IIiIIIlill, iiiiiiIlIIIIIIll.IIlIliIlll, "", false, false, false);
                  } else if (p.Iilllilliill()) {
                     return IIIilIIiiIIi(iiiiiiIlIIIIIIll.iIlIliIlll);
                  } else if (this.IiIlliiill) {
                     return IIIilIIiiIIi(iiiiiiIlIIIIIIll.IllIliIlll);
                  } else {
                     return p.Iilililiiili() >= 3
                        ? IIIilIIiiIIi(iiiiiiIlIIIIIIll.lIiIliIlll)
                        : new illiIiilIiliIiil(IiIIilllliIIilll.iilIIIlill, iiiiiiIlIIIIIIll.IIIIliIlll, "", false, true, false);
                  }
               }
            }
         } else {
            return this.Ililllililil(iiiiiiIlIIIIIIll.iIiIliIlll, this.lIiIliiill == null);
         }
      }
   }

   public void IilliliilIIi(long atMs) {
      this.IIIlliiill = atMs;
   }

   private static illiIiilIiliIiil IIIilIIiiIIi(iiiiiiIlIIIIIIll reason) {
      return new illiIiilIiliIiil(IiIIilllliIIilll.IIiIIIlill, reason, "", false, true, false);
   }

   private void IlIlllIlilIl(iIlIllIiIllIllIi p) {
      if (p.IIIllIIliIIl()) {
         this.IlIlliiill = true;
         this.iIIlliiill = p.liiiIIllIl();
      } else if (this.IlIlliiill && !IiIlliIliiIl(p.liiiIIllIl(), this.iIIlliiill)) {
         this.IlIlliiill = false;
      }

      if (p.IIlllIlliIll() || p.Illlllllilll()) {
         this.ilIlliiill = true;
         this.llIlliiill = p.liiiIIllIl();
      } else if (this.ilIlliiill && !IiIlliIliiIl(p.liiiIIllIl(), this.llIlliiill)) {
         this.ilIlliiill = false;
      }

      double var2 = p.IIillIiliIil();
      if (!Double.isNaN(var2)) {
         if (this.IiIlliiill) {
            if (var2 >= 12.0) {
               this.IiIlliiill = false;
            }
         } else if (var2 < 10.0) {
            this.IiIlliiill = true;
         }
      }
   }

   private void Iilllilliill(long setbackMs) {
      this.lIIlliiill = setbackMs;
      this.IIIlliiill = -1L;
      this.IIllliiill.removeLastOccurrence(setbackMs);
   }

   private static void IIillIiliIil(ArrayDeque<Long> now, long times) {
      while (!now.isEmpty() && times - now.peekFirst() >= 10000L) {
         now.removeFirst();
      }
   }

   public int IIIllIIliIIl() {
      return this.IIllliiill.size();
   }

   public void IliIlllilIi(Object nowMs, long sessionId) {
      this.lIiIliiill = nowMs;
      this.iIiIliiill = nowMs != null;
      this.IliIliiill = sessionId;
      this.lliIliiill = null;
      this.iliIliiill = null;
      this.IiiIliiill = 0L;
      this.liiIliiill = 0L;
      this.iiiIliiill = -1L;
      this.IIIlliiill = -1L;
      this.lIIlliiill = -1L;
      this.IlIlliiill = false;
      this.ilIlliiill = false;
      this.IiIlliiill = false;
      this.liIlliiill = null;
      this.iiIlliiill.clear();
      this.IIllliiill.clear();
   }

   public boolean liiiIIllIl() {
      return this.lIiIliiill != null && this.liIlliiill == null;
   }

   public Illliilllllliill() {
      this.IIllliiill = new ArrayDeque<>();
   }

   public boolean iliIiiliiiii() {
      long var7 = -1014844154183661728L;
      if (this.iiIlliiill.isEmpty()) {
         return false;
      } else {
         long var1 = this.iiIlliiill.peekLast();
         var7 ^= (0L ^ var7) & -1L << 32;

         for (long var5 : this.iiIlliiill) {
            if (var1 - var5 < 10000L) {
               var7 += 4294967296L;
            }
         }

         return (int)(var7 >>> 32) >= 3;
      }
   }

   private boolean Illlllllilll(long setbackMs) {
      if (this.IIIlliiill >= 0L && setbackMs >= 0L) {
         long var3 = setbackMs - this.IIIlliiill;
         return var3 >= -1000L && var3 <= 250L;
      } else {
         return false;
      }
   }

   public void lIiiIiIlilli(long nowMs) {
      this.iiIlliiill.addLast(nowMs);

      while (this.iiIlliiill.size() > 12) {
         this.iiIlliiill.removeFirst();
      }
   }

   private static boolean IiIlliIliiIl(long lastTick, long tick) {
      return lastTick >= tick && lastTick - tick <= 2L;
   }

   private illiIiilIiliIiil Ililllililil(iiiiiiIlIIIIIIll reason, boolean quiet) {
      this.liIlliiill = new illiIiilIiliIiil(IiIIilllliIIilll.iIiIIIlill, reason, "", true, false, quiet);
      this.iIiIliiill = false;
      return this.liIlliiill;
   }

   private static illiIiilIiliIiil Iiilliiliiil(iiiiiiIlIIIIIIll reason, String resetState, boolean detail) {
      return new illiIiilIiliIiil(IiIIilllliIIilll.lIiIIIlill, reason, resetState, detail, false, false);
   }
}
