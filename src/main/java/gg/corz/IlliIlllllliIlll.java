package gg.corz;

import net.minecraft.class_2338;

public record IlliIlllllliIlll(
   boolean attached,
   String status,
   IlliIlillliIli kind,
   class_2338 base,
   int crystalId,
   double value,
   int targetId,
   boolean holding,
   long lastPlaceTick,
   long lastBreakTick,
   long lastActionTick,
   int wantedSlot,
   String directiveStatus
) {
   private final String iliIIlIill;
   private final long IliIIlIill;
   private final long iIiIIlIill;
   private final class_2338 illIIlIill;
   private final int iilIIlIill;
   private final String IllIIlIill;
   private final long lIiIIlIill;
   private final boolean IIiIIlIill;
   public static final IlliIlllllliIlll IiiIIlIill = new IlliIlllllliIlll(
      false, null, null, null, -1, 0.0, -1, false, Long.MIN_VALUE, Long.MIN_VALUE, Long.MIN_VALUE, -1, null
   );
   private final int IilIIlIill;
   private final boolean iIlIIlIill;
   private final double lilIIlIill;
   private final IlliIlillliIli lllIIlIill;
   private final int lliIIlIill;

   public boolean IliIlllilIi() {
      return this.iIlIIlIill;
   }

   public boolean IlIlllIlilIl() {
      return this.IIiIIlIill;
   }

   public IlliIlllllliIlll(
      boolean attached,
      String status,
      IlliIlillliIli kind,
      class_2338 base,
      int crystalId,
      double value,
      int targetId,
      boolean holding,
      long lastPlaceTick,
      long lastBreakTick,
      long lastActionTick,
      int wantedSlot,
      String directiveStatus
   ) {
      this.iIlIIlIill = attached;
      this.IllIIlIill = status;
      this.lllIIlIill = kind;
      this.illIIlIill = base;
      this.IilIIlIill = crystalId;
      this.lilIIlIill = value;
      this.iilIIlIill = targetId;
      this.IIiIIlIill = holding;
      this.lIiIIlIill = lastPlaceTick;
      this.iIiIIlIill = lastBreakTick;
      this.IliIIlIill = lastActionTick;
      this.lliIIlIill = wantedSlot;
      this.iliIIlIill = directiveStatus;
   }

   public int Iilllilliill() {
      return this.lliIIlIill;
   }

   public double iliIiiliiiii() {
      return this.lilIIlIill;
   }

   public String liiiIIllIl() {
      return this.IllIIlIill;
   }

   public long IiIlliIliiIl() {
      return this.lIiIIlIill;
   }

   public int IIIllIIliIIl() {
      return this.iilIIlIill;
   }

   public IlliIlllllliIlll(
      boolean lastBreakTick,
      String lastActionTick,
      IlliIlillliIli kind,
      class_2338 targetId,
      int crystalId,
      double value,
      int lastPlaceTick,
      boolean base,
      long status,
      long attached,
      long wantedSlot,
      int holding
   ) {
      this(lastBreakTick, lastActionTick, kind, targetId, crystalId, value, lastPlaceTick, base, status, attached, wantedSlot, holding, null);
   }

   public int lIiiIiIlilli() {
      return this.IilIIlIill;
   }

   public String IIillIiliIil() {
      return this.iliIIlIill;
   }

   public long Illlllllilll() {
      return this.IliIIlIill;
   }

   public class_2338 IilliliilIIi() {
      return this.illIIlIill;
   }

   public IlliIlillliIli iIlIlllllill() {
      return this.lllIIlIill;
   }

   public long IIlllIlliIll() {
      return this.iIiIIlIill;
   }
}
