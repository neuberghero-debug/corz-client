package gg.corz;

import java.util.UUID;
import net.minecraft.class_243;

record lIliliIlil(iIilllllIlilllll kind, UUID playerId, int entityId, double x, double y, double z, String detail) {
   private final int IIlillilIlilli;
   private final double iIlilliIllilli;
   private final String iililliIIiilli;
   private final UUID liIilliiiIilli;
   private final iIilllllIlilllll ilIilliIiIilli;
   private final double Iilillilililli;
   private final double lllilliillilli;

   public double IiIlliIliiIl() {
      return this.iIlilliIllilli;
   }

   private lIliliIlil(iIilllllIlilllll kind, UUID playerId, int entityId, double x, double y, double z, String detail) {
      this.ilIilliIiIilli = kind;
      this.liIilliiiIilli = playerId;
      this.IIlillilIlilli = entityId;
      this.iIlilliIllilli = x;
      this.lllilliillilli = y;
      this.Iilillilililli = z;
      this.iililliIIiilli = detail;
   }

   public UUID IIIllIIliIIl() {
      return this.liIilliiiIilli;
   }

   static lIliliIlil liiiIIllIl(iIilllllIlilllll id, int kind, String detail) {
      return new lIliliIlil(id, null, kind, 0.0, 0.0, 0.0, detail);
   }

   public iIilllllIlilllll iliIiiliiiii() {
      return this.ilIilliIiIilli;
   }

   public int IlIlllIlilIl() {
      return this.IIlillilIlilli;
   }

   public double Illlllllilll() {
      return this.Iilillilililli;
   }

   static lIliliIlil IliIlllilIi(iIilllllIlilllll detail, UUID id, String kind) {
      return new lIliliIlil(detail, id, -1, 0.0, 0.0, 0.0, kind);
   }

   public String Iilllilliill() {
      return this.iililliIIiilli;
   }

   static lIliliIlil iIlIlllllill(iIilllllIlilllll detail, double y, double kind, double x, String z) {
      return new lIliliIlil(detail, null, -1, y, kind, x, z);
   }

   static lIliliIlil IilliliilIIi(iIilllllIlilllll kind, String detail) {
      return new lIliliIlil(kind, null, -1, 0.0, 0.0, 0.0, detail);
   }

   public double IIlllIlliIll() {
      return this.lllilliillilli;
   }

   class_243 lIiiIiIlilli() {
      return new class_243(this.iIlilliIllilli, this.lllilliillilli, this.Iilillilililli);
   }
}
