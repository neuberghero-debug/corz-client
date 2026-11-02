package gg.corz;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ThreadLocalRandom;
import java.util.function.DoubleSupplier;

public final class lIIiIiiIIiIi {
   private boolean lIIliIIIliIIliIIIl;
   private static final long IllIiIIIllllIiIIIl = 40L;
   private final Map<Integer, Long> iIiIiIIIlIliIiIIIl;
   public static final int IIIIiIIIllIIIiIIIl = 1;
   private float IlIliIIIlllIliIIIl;
   private final Map<Long, Long> lilIiIIIliilIiIIIl = new HashMap<>();
   private float ilIliIIIlIiIliIIIl;
   public static final int iliilIIIlIiiilIIIl = 2;
   public static final long IliilIIIllliilIIIl = 120L;
   public static final double lIiilIIIliIiilIIIl = 0.02;
   public static final long iiIIiIIIlIIlIiIIIl = 5000L;
   private final Map<Long, Long> lliIiIIIliliIiIIIl;
   public static final long llIIiIIIlilIIiIIIl = 5000L;
   private long IIlliIIIllIlliIIIl;
   private final Map<Long, Long> IiiIiIIIlliiIiIIIl;
   private long iIlliIIIlIllliIIIl;
   private final Map<Long, Long> iiiIiIIIlIIIliIIIl;
   public static final int liiilIIIliiiilIIIl = 4;
   public static final int iIIIiIIIlIlIIiIIIl = 3;
   public static final long iililIIIlIIiilIIIl = 1000L;
   private static final long lIlIiIIIliIlIiIIIl = 40L;
   private long liIliIIIliiIliIIIl;
   public static final long IiIIiIIIlliIIiIIIl = 2000L;
   private final DoubleSupplier illIiIIIlIilIiIIIl;
   private final Map<Integer, ilIlilllIiIlilll> IIiIiIIIllIiIiIIIl = new HashMap<>();

   public void Iilililiiili(long tick, long cellKey) {
      this.lliIiIIIliliIiIIIl.put(tick, cellKey);
      this.IiiIiIIIlliiIiIIIl.remove(tick);
   }

   public boolean Illillliilli(int nowMs, long entityId, int waitTicks, long tick) {
      if (this.IIlilIliiIli(nowMs, tick)) {
         return false;
      } else {
         ilIlilllIiIlilll var7 = this.IIiIiIIIllIiIiIIIl.get(nowMs);
         if (var7 == null) {
            return true;
         } else if (entityId - var7.IliIlllilIi() < (long)waitTicks) {
            return false;
         } else if (var7.liiiIIllIl() >= 3) {
            this.IIiIiIIIllIiIiIIIl.remove(nowMs);
            this.iIiIiIIIlIliIiIIIl.put(nowMs, tick);
            return false;
         } else {
            return true;
         }
      }
   }

   public boolean Ililllililil(long tick) {
      return !this.lIIliIIIliIIliIIIl || tick >= this.IIlliIIIllIlliIIIl;
   }

   public boolean Iiiiliiiiiii(long cellKey, long waitTicks, int tick) {
      Long var6 = this.lliIiIIIliliIiIIIl.get(cellKey);
      return var6 == null || waitTicks - var6 >= (long)tick;
   }

   public Set<Long> IIiilIiiiIii() {
      return new HashSet<>(this.lliIiIIIliliIiIIIl.keySet());
   }

   public int IlIillIiilIi(int entityId) {
      ilIlilllIiIlilll var2 = this.IIiIiIIIllIiIiIIIl.get(entityId);
      return var2 == null ? 0 : var2.liiiIIllIl();
   }

   public lIIiIiiIIiIi() {
      this(() -> ThreadLocalRandom.current().nextDouble());
   }

   public void liiiIIllIl(long pitch, long yaw, long baseKey, float tick, float nowMs) {
      this.iIlIlllllill(pitch, yaw, baseKey, tick, nowMs, false);
   }

   public void IilliliilIIi(long nowMs, long yaw, float pitch, float tick) {
      this.lIiiIiIlilli(nowMs, yaw, pitch, tick, false);
   }

   public void iIlIlllllill(long pitch, long baseKey, long yaw, float fast, float nowMs, boolean tick) {
      this.lilIiIIIliilIiIIIl.put(pitch, baseKey);
      this.iiiIiIIIlIIIliIIIl.put(pitch, baseKey);
      this.lIiiIiIlilli(baseKey, yaw, fast, nowMs, tick);
   }

   public long IIIllIIliIIl() {
      return this.iIlliIIIlIllliIIIl;
   }

   public long Iliilliiilii(long cellKey) {
      Long var3 = this.lliIiIIIliliIiIIIl.get(cellKey);
      return var3 == null ? Long.MIN_VALUE : var3;
   }

   static int IlIlllIlilIl(double roll) {
      return roll < 0.05 ? 4 : (roll < 0.3 ? 3 : 2);
   }

   public void lIiiIiIlilli(long yaw, long nowMs, float pitch, float fast, boolean tick) {
      this.lIIliIIIliIIliIIIl = true;
      this.IlIliIIIlllIliIIIl = pitch;
      this.ilIliIIIlIiIliIIIl = fast;
      this.liIliIIIliiIliIIIl = yaw;
      this.IIlliIIIllIlliIIIl = nowMs + (long)(tick ? 1 : IlIlllIlilIl(this.illIiIIIlIilIiIIIl.getAsDouble()));
   }

   public void iliIiiliiiii(long ms) {
      this.iIlliIIIlIllliIIIl = ms > 0L ? ms : 1000L;
   }

   public void IIIIllIIIl(long cellKey, long nowMs) {
      this.lliIiIIIliliIiIIIl.remove(cellKey);
      this.IiiIiIIIlliiIiIIIl.put(cellKey, nowMs);
   }

   public boolean IiIiliIiiiIi(int tick, long entityId, int waitTicks) {
      ilIlilllIiIlilll var5 = this.IIiIiIIIllIiIiIIIl.get(tick);
      return var5 != null && entityId - var5.IliIlllilIi() < (long)waitTicks;
   }

   public void IIlllIlliIll(long baseKey) {
      this.lilIiIIIliilIiIIIl.remove(baseKey);
   }

   public void IliIlllilIi() {
      this.lilIiIIIliilIiIIIl.clear();
      this.IIiIiIIIllIiIiIIIl.clear();
      this.iIiIiIIIlIliIiIIIl.clear();
      this.lliIiIIIliliIiIIIl.clear();
      this.IiiIiIIIlliiIiIIIl.clear();
      this.iiiIiIIIlIIIliIIIl.clear();
      this.lIIliIIIliIIliIIIl = false;
      this.IlIliIIIlllIliIIIl = 0.0F;
      this.ilIliIIIlIiIliIIIl = 0.0F;
      this.liIliIIIliiIliIIIl = 0L;
      this.IIlliIIIllIlliIIIl = 0L;
   }

   lIIiIiiIIiIi(DoubleSupplier roll) {
      this.iIiIiIIIlIliIiIIIl = new HashMap<>();
      this.lliIiIIIliliIiIIIl = new HashMap<>();
      this.IiiIiIIIlliiIiIIIl = new HashMap<>();
      this.iiiIiIIIlIIIliIIIl = new HashMap<>();
      this.iIlliIIIlIllliIIIl = 1000L;
      this.illIiIIIlIilIiIIIl = roll;
   }

   public Set<Long> Illlllllilll() {
      return new HashSet<>(this.lilIiIIIliilIiIIIl.keySet());
   }

   public void Iilllilliill(long nowMs, long tick) {
      this.lilIiIIIliilIiIIIl.values().removeIf(at -> nowMs - at > this.iIlliIIIlIllliIIIl);
      this.IIiIiIIIllIiIiIIIl.values().removeIf(tickx -> tick - tickx.IliIlllilIi() > 40L);
      this.iIiIiIIIlIliIiIIIl.values().removeIf(nowMsx -> nowMs - nowMsx > 5000L);
      this.lliIiIIIliliIiIIIl.values().removeIf(at -> tick - at > 40L);
      this.IiiIiIIIlliiIiIIIl.values().removeIf(nowMsx -> nowMs - nowMsx > 2000L);
      this.iiiIiIIIlIIIliIIIl.values().removeIf(nowMsx -> nowMs - nowMsx > 5000L);
   }

   public void IIIilIIiiIIi(int entityId, long tick) {
      ilIlilllIiIlilll var4 = this.IIiIiIIIllIiIiIIIl.get(entityId);
      this.IIiIiIIIllIiIiIIIl.put(entityId, new ilIlilllIiIlilll(tick, var4 == null ? 1 : var4.liiiIIllIl() + 1));
   }

   public boolean IIlilIliiIli(int nowMs, long entityId) {
      Long var4 = this.iIiIiIIIlIliIiIIIl.get(nowMs);
      if (var4 == null) {
         return false;
      } else if (entityId - var4 > 5000L) {
         this.iIiIiIIIlIliIiIIIl.remove(nowMs);
         return false;
      } else {
         return true;
      }
   }

   public boolean IiIlliIliiIl(long nowMs, long baseKey) {
      Long var5 = this.lilIiIIIliilIiIIIl.get(nowMs);
      if (var5 == null) {
         return false;
      } else if (baseKey - var5 > this.iIlliIIIlIllliIIIl) {
         this.lilIiIIIliilIiIIIl.remove(nowMs);
         return false;
      } else {
         return true;
      }
   }

   public boolean Iiilliiliiil(float nowMs, float pitch, long yaw) {
      if (!this.lIIliIIIliIIliIIIl) {
         return false;
      } else {
         double var5 = liiIIliliiiIIlil.Iilllilliill(this.IlIliIIIlllIliIIIl, this.ilIliIIIlIiIliIIIl, nowMs, pitch);
         return var5 < 0.02 && yaw - this.liIliIIIliiIliIIIl < 120L;
      }
   }

   public boolean IIillIiliIil(long baseKey, long nowMs) {
      Long var5 = this.iiiIiIIIlIIIliIIIl.get(baseKey);
      return var5 != null && nowMs - var5 <= 5000L;
   }

   public boolean iIIIlIlIIl(long cellKey, long nowMs) {
      Long var5 = this.IiiIiIIIlliiIiIIIl.get(cellKey);
      if (var5 == null) {
         return false;
      } else if (nowMs - var5 > 2000L) {
         this.IiiIiIIIlliiIiIIIl.remove(cellKey);
         return false;
      } else {
         return true;
      }
   }
}
